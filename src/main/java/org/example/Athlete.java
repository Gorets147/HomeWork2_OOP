package org.example;

public abstract class Athlete {

    protected  String name;
    private int MAX_DIST_RUN;
    private int MAX_HEIGHT_JUMP;

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
