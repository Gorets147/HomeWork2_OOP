package org.example;

public class Cat extends Athlete{
    private String name;
    private final int MAX_DIST_RUN = 200;
    private final int MAX_HEIGHT_JUMP = 4;

    public Cat() {
    }

    public Cat(String name) {
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
        System.out.println("Кот прыгнул: " + heightJump);
    }

    @Override
    public void run(int runDistance){
        System.out.println("Кот пробежал: " + runDistance);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", MAX_DIST_RUN=" + MAX_DIST_RUN +
                ", MAX_DIST_JUMP=" + MAX_HEIGHT_JUMP +
                '}';
    }
}
