package org.example;

import org.example.barrier.Barrier;
import org.example.barrier.BrickWall;
import org.example.barrier.RunTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Иван");
        Cat cat = new Cat("Васька");
        Robot robot = new Robot("R2-D2");

        List<Athlete> listAtlets = new ArrayList<>();
        listAtlets.add(man);
        listAtlets.add(cat);
        listAtlets.add(robot);

        BrickWall bw1 = new BrickWall(1, "wall");
        RunTrack rt1 = new RunTrack(150, "track");
        List<Barrier> listBarrier = new ArrayList<>();
        listBarrier.add(bw1);
        listBarrier.add(rt1);

        System.out.println(listBarrier);

        for(Barrier barrier : listBarrier){
            for (Athlete athlete : listAtlets){
                if (barrier.getKind().equals("wall")){
                    if (athlete.getMAX_HEIGHT_JUMP() >= barrier.getHeight()){
                        System.out.println("Высота: " + athlete.getMAX_HEIGHT_JUMP());
                        athlete.jump(barrier.getHeight());
                    } else {
                        System.out.println(athlete.getName() + " не перепрыгнул");
                        listAtlets.remove(athlete);
                    }
                } else {
                    if (athlete.getMAX_DIST_RUN() >= barrier.getLengthDistance()){
                        System.out.println("Дистанция: " + barrier.getLengthDistance());
                        athlete.run(barrier.getLengthDistance());
                    } else {
                        System.out.println(athlete.getName() + " не пробежал");
                        listAtlets.remove(athlete);
                    }
                }
            }
        }
    }
}