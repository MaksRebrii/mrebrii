package hw10ToLesson13;

import java.util.Random;

public class Box {
    private int length;
    private int width;
    private int height;
    private int weight;

    public Box() {
        this.length = new Random().nextInt(100);
        this.width = new Random().nextInt(100);
        this.height = new Random().nextInt(100);
        this.weight = new Random().nextInt(1000);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                '}';
    }
}
