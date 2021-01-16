export class GitRepository {
  constructor(public nodeId: string, public id: number, public htmlUrl: String, public description: string,
              public cloneUrl: String, public openIssues: number,
              public startGazersCount: number,
              public watchersCount: number,
              public fullName: string, public name: string,
              public isBookmarked: boolean
  ) {
  }
}
