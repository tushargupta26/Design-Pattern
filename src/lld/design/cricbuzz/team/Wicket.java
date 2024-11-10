package lld.design.cricbuzz.team;

import lld.design.cricbuzz.inning.BallDetails;
import lld.design.cricbuzz.inning.OverDetails;
import lld.design.cricbuzz.team.player.PlayerDetails;

public class Wicket {

    public PlayerDetails takenBy;
    public WicketType wicketType;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail) {

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
