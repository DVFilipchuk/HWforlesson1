package Creatures;

public class Robot {

    private String RobotName;
    private int MaxJump;
    private int MaxRun;

    public Robot(String robotName, int maxJump, int maxRun) {
    this.RobotName = robotName;
    this.MaxJump = maxJump;
    this.MaxRun = maxRun;
    }

    public String getRobotName() {
        return RobotName;
    }


    public int getMaxJump() {
        return MaxJump;
    }



    public int getMaxRun() {
        return MaxRun;
    }


}
