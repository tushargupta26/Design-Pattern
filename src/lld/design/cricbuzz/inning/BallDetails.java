package lld.design.cricbuzz.inning;

import lld.design.cricbuzz.scoreUpdater.BattingScoreUpdater;
import lld.design.cricbuzz.scoreUpdater.ScoreUpdaterObserver;
import lld.design.cricbuzz.team.Team;
import lld.design.cricbuzz.team.Wicket;
import lld.design.cricbuzz.team.WicketType;
import lld.design.cricbuzz.team.player.PlayerDetails;
import lld.design.cricbuzz.team.player.score.BowlingScoreUpdater;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {

    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails bowledBy;
    public PlayerDetails playedBy;
    public Wicket wicket;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList = new ArrayList<>();

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
        scoreUpdaterObserverList.add(new BowlingScoreUpdater());
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
    }

    public void startBallDelivery(Team battingTeam, Team bowlingTeam, OverDetails over){
        if(isWicketTaken()){
            runType = RunType.ZERO;
            wicket = new Wicket(WicketType.BOLD, bowlingTeam.getCurrentBowler(), over, this);
            battingTeam.setStriker(null);
        } else {
            runType = getRunType();
            if(runType == RunType.ONE || runType == RunType.THREE){
                PlayerDetails temp = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }
        notifyUpdaters(this);
    }

    private void notifyUpdaters(BallDetails ballDetails){

        for(ScoreUpdaterObserver observer : scoreUpdaterObserverList) {
            observer.update(ballDetails);
        }
    }

    private RunType getRunType() {

        double val = Math.random();
        if (val <= 0.2) {
            return RunType.ONE;
        } else if (val >= 0.3 && val <= 0.5) {
            return RunType.TWO;
        } else if (val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

    private boolean isWicketTaken() {
        //random function return value between 0 and 1
        if (Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }
}
