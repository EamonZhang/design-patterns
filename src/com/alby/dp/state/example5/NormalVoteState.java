package com.alby.dp.state.example5;


/**
 * Created by xianwei on 2015/12/14.
 *
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
       //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");

        //正常投票完成，维护下一个状态，同一个人再投票就重复了
        voteManager.getMapState().put(user,new RepeatVoteState());
    }
}
