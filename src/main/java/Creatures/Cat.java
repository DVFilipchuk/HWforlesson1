package Creatures;

public class Cat {

    private String CatName;
    private int MaxJump;
    private int MaxRun;

    public Cat(String catName, int maxJump, int maxRun) {
        this.CatName = catName;
        this.MaxJump = maxJump;
        this.MaxRun = maxRun;
    }

    public String getCatName() {
        return CatName;
    }


    public int getMaxJump() {
        return MaxJump;
    }



    public int getMaxRun() {
        return MaxRun;
    }
}
