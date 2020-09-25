package Actions;

import Barriers.RunningTrack;
import Barriers.Wall;
import Creatures.Human;

public class HumanActions extends Human {


    public HumanActions(String humanName, int maxJump, int maxRun) {
        super(humanName, maxJump, maxRun);
    }

    private RunningTrack runningTrack;
    private Wall wall;



    public boolean IfHumanCanRun(Human human) {

        if (getMaxRun() >= runningTrack.getTrackLength()) return true;
        else return false;
    }

    public boolean IfHumanCanClimb(Human human){

        if (getMaxJump() >= wall.getWallHeigth()) return true;
        else return false;
    }
}
