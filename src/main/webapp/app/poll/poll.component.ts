import {Component, OnInit} from '@angular/core';
import {JhiLanguageService} from "ng-jhipster";
import {LoginModalService} from "../core/login/login-modal.service";
import {RegisterService} from "../account/register/register.service";
import {FormBuilder} from "@angular/forms";
import {Account} from "../core/user/account.model";
import {PollService} from "./poll.service";
import {GitRepository} from "./poll.model";

@Component({
  selector: 'jhi-poll',
  templateUrl: './poll.component.html',
  styleUrls: ['./poll.component.scss']
})
export class PollComponent implements OnInit {
  account: Account | null = null;
  error = false;
  success = false;
  public upstreamRepos: {} = '';
  public bookmarks: GitRepository[] = [];

// &per_page=2
  // pollUrl: string = "https://api.github.com/search/repositories?q=all&sort=stars&order=desc";
  // pageSize: number = 10;
  constructor(
    private languageService: JhiLanguageService,
    private loginModalService: LoginModalService,
    private registerService: RegisterService,
    private fb: FormBuilder,
    private pollService: PollService
  ) {
  }

  ngOnInit(): void {
  }

  // getStored(): void {
  //   this.pollService.findAll().subscribe(bookmarks => {
  //     this.bookmarks = bookmarks
  //   });
  // }
  //
  // getUpstreamRepos(): void {
  //   this.pollService.refresh().subscribe(upstremRepos => (this.upstreamRepos = upstremRepos))
  // }
  //
  // addBookmark(id: number): void {
  //   this.error = false;
  //   this.success = false;
  //
  //   // this.pollService.bookmark(encodeURIComponent(id)).subscribe(
  //   //   () => {
  //   //     this.success = true;
  //   //     this.pollService.findAll().subscribe(bookmarks => (this.bookmarks = bookmarks));
  //   //   },
  //   //   () => (this.error = true)
  //   // );
  // }
  //
  // deleteBookmark(series: number): void {
  //   this.error = false;
  //   this.success = false;
  //
  //   this.pollService.delete(Number(encodeURIComponent(series))).subscribe(
  //     () => {
  //       this.success = true;
  //       this.pollService.findAll().subscribe(bookmarks => (this.bookmarks = bookmarks));
  //     },
  //     () => (this.error = true)
  //   );
  // }

}
