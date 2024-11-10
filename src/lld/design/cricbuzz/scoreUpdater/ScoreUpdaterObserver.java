package lld.design.cricbuzz.scoreUpdater;

import lld.design.cricbuzz.inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
