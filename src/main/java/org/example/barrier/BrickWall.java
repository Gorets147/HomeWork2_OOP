package org.example.barrier;

public class BrickWall extends Barrier{

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
