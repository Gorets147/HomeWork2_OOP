package org.example.barrier;

public abstract class Barrier {
    protected int lengthDistance;
    protected int height;

    protected String kind;

    public Barrier(int lengthDistance, int height, String kind) {
        this.lengthDistance = lengthDistance;
        this.height = height;
        this.kind = kind;
    }

    public int getLengthDistance() {
        return lengthDistance;
    }

    public int getHeight() {
        return height;
    }

    public String getKind() {
        return kind;
    }

    public void setLengthDistance(int lengthDistance) {
        this.lengthDistance = lengthDistance;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Barrier{" +
                "lengthDistance=" + lengthDistance +
                ", height=" + height +
                ", kind='" + kind + '\'' +
                '}';
    }
}
