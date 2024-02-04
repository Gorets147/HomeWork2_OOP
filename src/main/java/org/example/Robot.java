package org.example;

public class Robot extends Athlete{

    private String name;
    private final int MAX_DIST_RUN = 600;
    private final int MAX_HEIGHT_JUMP = 2;

    public Robot() {
    }

    public Robot(String name) {
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

    public int getMAX_DIST_JUMP() {
        return MAX_HEIGHT_JUMP;
    }

    @Override
    public void jump(int heightJump){
        System.out.println("Робот прыгнул: " + heightJump);
    }

    @Override
    public void run(int runDistance){
        System.out.println("Робот пробежал: " + runDistance);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", MAX_DIST_RUN=" + MAX_DIST_RUN +
                ", MAX_DIST_JUMP=" + MAX_HEIGHT_JUMP +
                '}';
    }
}
