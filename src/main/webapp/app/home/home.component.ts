import {Component, OnDestroy, OnInit} from '@angular/core';
import {combineLatest, Subscription} from 'rxjs';

import {LoginModalService} from 'app/core/login/login-modal.service';
import {AccountService} from 'app/core/auth/account.service';
import {Account} from 'app/core/user/account.model';
import {PollService} from "../poll/poll.service";
import {GitRepository, IGitRepository} from "../poll/poll.model";
import {ITEMS_PER_PAGE} from "../shared/constants/pagination.constants";
import {ActivatedRoute, Data, ParamMap, Router} from "@angular/router";
import {HttpHeaders, HttpResponse} from "@angular/common/http";
import {JhiEventManager} from "ng-jhipster";
import {SERVER_API_URL} from "../app.constants";

@Component({
  selector: 'jhi-home',
  templateUrl: './home.component.html',
  styleUrls: ['home.scss'],
})
export class HomeComponent implements OnInit, OnDestroy {
  account: Account | null = null;
  authSubscription?: Subscription;
  repoListSubscription?: Subscription;
  bookmarks: GitRepository[] | null = null;

  totalItems = 0;
  itemsPerPage = ITEMS_PER_PAGE;
  page!: number;
  predicate!: string;
  ascending!: boolean;
  public resourceUrl = SERVER_API_URL + 'api/polls/bookmarks/';

  constructor(private accountService: AccountService, private loginModalService: LoginModalService, private pollService: PollService, private router: Router, private activatedRoute: ActivatedRoute, private eventManager: JhiEventManager,) {
  }

  ngOnInit(): void {
    this.authSubscription = this.accountService.getAuthenticationState().subscribe(account => (this.account = account));
    this.repoListSubscription = this.eventManager.subscribe('repoListSubscription', () => this.loadAll());
    this.pollService.findAll().subscribe(results => (this.bookmarks = results));
  }

  isAuthenticated(): boolean {
    return this.accountService.isAuthenticated();
  }

  login(): void {
    this.loginModalService.open();
  }

  repoIdentity(index: number, item: GitRepository): any {
    return item.id;
  }

  ngOnDestroy(): void {
    if (this.authSubscription) {
      this.authSubscription.unsubscribe();
    }
    if (this.repoListSubscription) {
      this.eventManager.destroy(this.repoListSubscription);
    }
  }

  bookMark(repo: GitRepository, isBookMarked: boolean): void {
    this.pollService.bookmark({...repo, bookmarked: isBookMarked}).subscribe(() => this.loadAll());
  }

  refresh(): void {
    this.pollService.refresh().subscribe(() => this.loadAll());
  }

  transition(): void {
    this.router.navigate(['./'], {
      relativeTo: this.activatedRoute.parent,
      queryParams: {
        page: this.page,
        sort: this.predicate + ',' + (this.ascending ? 'asc' : 'desc'),
      },
    });
  }

  private loadAll(): void {
    this.pollService
      .query({
        page: 0,
        size: this.itemsPerPage,
        sort: this.sort(),
      })
      .subscribe((res: HttpResponse<IGitRepository[]>) => this.onSuccess(res.body, res.headers));
  }

  private sort(): string[] {
    const result = [this.predicate + ',' + (this.ascending ? 'asc' : 'desc')];
    if (this.predicate !== 'id') {
      result.push('id');
    }
    return result;
  }

  private onSuccess(repos: GitRepository[] | null, headers: HttpHeaders): void {
    this.totalItems = Number(headers.get('X-Total-Count'));
    this.bookmarks = repos;
  }
}
