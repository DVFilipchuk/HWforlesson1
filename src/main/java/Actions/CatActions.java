package Actions;

import Barriers.RunningTrack;
import Barriers.Wall;
import Creatures.Cat;


public class CatActions extends Cat {


    public CatActions(String catName, int maxJump, int maxRun) {
        super(catName, maxJump, maxRun);
    }

    private RunningTrack runningTrack;
    private Wall wall;



    public boolean IfCatCanRun(Cat cat) {

        if (getMaxRun() >= runningTrack.getTrackLength()) return true;
        else return false;
    }

    public boolean IfCatCanClimb(Cat cat){

        if (getMaxJump() >= wall.getWallHeigth()) return true;
        else return false;
    }

}
