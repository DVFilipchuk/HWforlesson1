package Actions;

import Barriers.RunningTrack;
import Barriers.Wall;
import Creatures.Robot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotActionsTest {

    private RobotActions robotActions;
    private RunningTrack runningTrack;
    private Wall wall;



    @Test
    public void RobotRuns() {

        Robot robot = new Robot("Bender", 5, 20);


        boolean a = robotActions.IfRobotCanClimb(robot);
        boolean b = robotActions.IfRobotCanRun(robot);


        Assertions.assertTrue(a);
        Assertions.assertTrue(b);






    }
}