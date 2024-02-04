package org.example.barrier;

public class BrickWall extends Barrier{
    private int height;

    public BrickWall(int height, String kind) {
        super(0, height, kind);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
