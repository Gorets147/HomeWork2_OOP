package org.example;

public class Cat extends Athlete{

    public Cat(String name) {
        super(name, 200, 4);
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
        return "Кот по " +
                "кличке: " + name + "\n";
    }
}
