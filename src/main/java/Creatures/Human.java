package Creatures;

public class Human {

    private String Humanname;
    private int MaxJump;
    private int MaxRun;

    public Human(String humanName, int maxJump, int maxRun) {
        this.Humanname = humanName;
        this.MaxJump = maxJump;
        this.MaxRun = maxRun;
    }

    public String getHumanname() {
        return Humanname;
    }


    public int getMaxJump() {
        return MaxJump;
    }



    public int getMaxRun() {
        return MaxRun;
    }
}
