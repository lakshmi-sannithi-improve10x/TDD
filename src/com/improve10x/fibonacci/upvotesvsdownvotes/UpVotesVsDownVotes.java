package com.improve10x.fibonacci.upvotesvsdownvotes;

public class UpVotesVsDownVotes {
    public int findVotes(int u, int d) {
        if (u<0 && d<0){
            return -1;
        }else {
            return u - d;
        }
    }
}

