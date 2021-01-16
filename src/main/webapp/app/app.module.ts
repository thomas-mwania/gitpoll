import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { GitpollSharedModule } from 'app/shared/shared.module';
import { GitpollCoreModule } from 'app/core/core.module';
import { GitpollAppRoutingModule } from './app-routing.module';
import { GitpollHomeModule } from './home/home.module';
import { GitpollEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';
import { PollComponent } from './poll/poll.component';

@NgModule({
  imports: [
    BrowserModule,
    GitpollSharedModule,
    GitpollCoreModule,
    GitpollHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    GitpollEntityModule,
    GitpollAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [MainComponent],
})
export class GitpollAppModule {}
