package org.example;

public class Robot extends Athlete{


    public Robot(String name) {
        super(name,600, 2);
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
        return "Киборг " +
                "модель: " + name + "\n";
    }
}
