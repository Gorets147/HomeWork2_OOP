package org.example;

public abstract class Athlete {

    protected  String name;
    protected int MAX_DIST_RUN;
    protected int MAX_HEIGHT_JUMP;

    public Athlete (String name, int MAX_DIST_RUN, int MAX_HEIGHT_JUMP){
        this.name = name;
        this.MAX_DIST_RUN = MAX_DIST_RUN;
        this.MAX_HEIGHT_JUMP = MAX_HEIGHT_JUMP;
    }

    public String getName() {
        return name;
    }

    public int getMAX_DIST_RUN() {
        return MAX_DIST_RUN;
    }

    public int getMAX_HEIGHT_JUMP() {
        return MAX_HEIGHT_JUMP;
    }

    protected abstract void jump(int heightJump);

    protected abstract void run(int runDistance);
}
