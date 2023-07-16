package com.improve10x.fibonacci.upvotesvsdownvotes;

public class UpvotesVsDownvotes {
    public int findVotes(int u, int d) {
        int votes = 0;
        votes = u - d;
        return votes;
    }
}

