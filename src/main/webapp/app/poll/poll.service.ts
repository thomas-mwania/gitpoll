import {Injectable} from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';

import {SERVER_API_URL} from '../app.constants';
import {Observable} from "rxjs";
import {GitRepository, IGitRepository} from "./poll.model";
import {createRequestOption, Pagination} from "../shared/util/request-util";

// import { Session } from './session.model';

@Injectable({providedIn: 'root'})
export class PollService {
  public resourceUrl = SERVER_API_URL + 'api/polls/bookmarks';
  public refreshUrl = SERVER_API_URL + 'api/polls/refresh';
  public bookmarkUrl = SERVER_API_URL + 'api/polls/bookmark';

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<GitRepository[]> {
    return this.http.get<GitRepository[]>(this.resourceUrl);
  }

  refresh(): Observable<IGitRepository[]> {
    this.http.get(`${this.refreshUrl}`);
    return this.http.get<GitRepository[]>(this.refreshUrl);
  }

  bookmark(repo: IGitRepository): Observable<IGitRepository> {
    return this.http.put<IGitRepository>(this.bookmarkUrl, repo);
  }

  delete(series: number): Observable<{}> {
    return this.http.delete(`${this.resourceUrl}${series}`);
  }

  query(req?: Pagination): Observable<HttpResponse<IGitRepository[]>> {
    const options = createRequestOption(req);
    return this.http.get<IGitRepository[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

}
