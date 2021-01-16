import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {SERVER_API_URL} from '../app.constants';
import {Observable} from "rxjs";
import {GitRepository} from "./poll.model";

// import { Session } from './session.model';

@Injectable({providedIn: 'root'})
export class PollService {
  public resourceUrl = SERVER_API_URL + 'api/polls/bookmarks/';
  public refreshUrl = SERVER_API_URL + 'api/polls/refresh';
  public bookmarkUrl = SERVER_API_URL + 'api/polls/bookmark/';

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<GitRepository[]> {
    return this.http.get<GitRepository[]>(this.resourceUrl);
  }

  refresh(): Observable<{}> {
    return this.http.get(`${this.refreshUrl}`);
  }

  bookmark(repo: number): Observable<{}> {
    return this.http.post<GitRepository[]>(`${this.bookmarkUrl}${repo}`, {})
  }

  delete(series: number): Observable<{}> {
    return this.http.delete(`${this.resourceUrl}${series}`);
  }

}
