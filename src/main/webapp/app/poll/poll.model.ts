export interface IGitRepository {
  nodeId?: string;
  id?: any;
  htmlUrl?: String;
  description?: string;
  cloneUrl?: String;
  openIssues?: number;
  stargazersCount?: number;
  watchersCount?: number;
  fullName?: string;
  name?: string;
  bookmarked?: boolean;
  owner?: string;
}

export class GitRepository {
  constructor(public nodeId?: string,
              public id?: any,
              public htmlUrl?: String,
              public description?: string,
              public cloneUrl?: String,
              public openIssues?: number,
              public stargazersCount?: number,
              public watchersCount?: number,
              public fullName?: string,
              public name?: string,
              public bookmarked?: boolean,
              public owner?: string
  ) {
  }
}
