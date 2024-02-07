package org.example;

public class Man extends Athlete{

    public Man(String name) {
        super(name, 500, 1);
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
        return "Человек " +
                "по имени: " + name + '\n';
    }
}
