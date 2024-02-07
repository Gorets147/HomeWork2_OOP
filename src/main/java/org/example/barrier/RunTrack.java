package org.example.barrier;

public class RunTrack extends Barrier{

    public RunTrack(int lengthDistance, String kind) {
        super(lengthDistance, 0, kind);
    }

    public int getLengthDistance() {
        return lengthDistance;
    }

    public void setLengthDistance(int lengthDistance) {
        this.lengthDistance = lengthDistance;
    }
}
