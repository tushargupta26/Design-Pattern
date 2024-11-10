package lld.design.cricbuzz.team.player;

import java.util.*;

public class PlayerBowlingController {

    Deque<PlayerDetails> bowlersList;
    Map<PlayerDetails, Integer> bowlersVsOverCount;
    PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlers) {
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<PlayerDetails> bowlersList){
        this.bowlersList = new LinkedList<>();
        bowlersVsOverCount = new HashMap<>();
        for (PlayerDetails bowler: bowlersList){
            this.bowlersList.addLast(bowler);
            bowlersVsOverCount.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOverCountPerBowler) {

        PlayerDetails playerDetails = bowlersList.poll();
        if(bowlersVsOverCount.get(playerDetails)+1 == maxOverCountPerBowler) {
            currentBowler = playerDetails;
        }
        else {
            currentBowler = playerDetails;
            bowlersList.addLast(playerDetails);
            bowlersVsOverCount.put(playerDetails, bowlersVsOverCount.get(playerDetails)+1);
        }
    }

    public PlayerDetails getCurrentBowler(){
        return currentBowler;
    }
}
