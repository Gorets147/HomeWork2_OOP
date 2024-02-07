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

        BrickWall bw1 = new BrickWall(2, "wall");
        RunTrack rt1 = new RunTrack(150, "track");
        List<Barrier> listBarrier = new ArrayList<>();
        listBarrier.add(bw1);
        listBarrier.add(rt1);

        System.out.println("Список участников: ");
        for (Athlete athlete : listAtlets) {
            System.out.println(athlete);
        }

        List<Athlete> winers = new ArrayList<>();

        for (Athlete athlete : listAtlets){
            boolean flag = true;
            for(Barrier barrier : listBarrier){
                if (barrier.getKind().equals("wall")){
                    if (athlete.getMAX_HEIGHT_JUMP() >= barrier.getHeight()){
                        athlete.jump(barrier.getHeight());
                    } else {
                        System.out.println(athlete.getName() + " не перепрыгнул");
                        flag = false;
                        break;
                    }
                } else {
                    if (athlete.getMAX_DIST_RUN() >= barrier.getLengthDistance()){
                        athlete.run(barrier.getLengthDistance());
                    } else {
                        System.out.println(athlete.getName() + " не пробежал");
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                winers.add(athlete);
            }
        }

        System.out.println("Список победителей: ");
        for (Athlete athlete : winers) {
            System.out.println(athlete);
        }

    }
}