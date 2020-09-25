package Actions;

import Creatures.Robot;
import Barriers.RunningTrack;
import Barriers.Wall;


public class RobotActions extends Robot{

    private RunningTrack runningTrack;
    private Wall wall;

    public RobotActions(String robotName, int maxJump, int maxRun) {
        super(robotName, maxJump, maxRun);
    }

    public boolean IfRobotCanRun(Robot robot) {

        if (getMaxRun() >= runningTrack.getTrackLength()) return true;
        else return false;
    }

    public boolean IfRobotCanClimb(Robot robot){

        if (getMaxJump() >= wall.getWallHeigth()) return true;
        else return false;
    }





}
