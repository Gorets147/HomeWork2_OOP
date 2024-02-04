package org.example;

public class Man extends Athlete{
    private String name;
    private final int MAX_DIST_RUN = 500;
    private final int MAX_HEIGHT_JUMP = 1;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMAX_DIST_RUN() {
        return MAX_DIST_RUN;
    }

    @Override
    public void jump(int heightJump){
        System.out.println(getName() + " прыгнул: " + heightJump);
    }

    @Override
    public void run(int runDistance){
        System.out.println(getName() + " пробежал: " + runDistance);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", MAX_DIST_RUN=" + MAX_DIST_RUN +
                ", MAX_DIST_JUMP=" + MAX_HEIGHT_JUMP +
                '}';
    }
}
