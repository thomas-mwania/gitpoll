import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';

import {LoginModalService} from 'app/core/login/login-modal.service';
import {AccountService} from 'app/core/auth/account.service';
import {Account} from 'app/core/user/account.model';
import {PollService} from "../poll/poll.service";
import {GitRepository} from "../poll/poll.model";
import {ITEMS_PER_PAGE} from "../shared/constants/pagination.constants";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
    selector: 'jhi-home',
    templateUrl: './home.component.html',
    styleUrls: ['home.scss'],
})
export class HomeComponent implements OnInit, OnDestroy {
    account: Account | null = null;
    authSubscription?: Subscription;
    bookmarks: GitRepository[] = [];
    totalItems = 0;
    itemsPerPage = ITEMS_PER_PAGE;
    page!: number;
    predicate!: string;
    ascending!: boolean;

    constructor(private accountService: AccountService, private loginModalService: LoginModalService, private pollService: PollService, private router: Router, private activatedRoute: ActivatedRoute) {
    }

    ngOnInit(): void {
        this.authSubscription = this.accountService.getAuthenticationState().subscribe(account => (this.account = account));
        this.pollService.findAll().subscribe(results => {
            results.forEach(g => this.bookmarks.push(g))
        })
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

}
