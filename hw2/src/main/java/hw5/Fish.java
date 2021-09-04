package hw5;

public class Fish extends Pet{
    public Fish(int age, float weight, String color, String name) {
        super(age, weight, color, name, false);
    }

    @Override
    public void voice() {
        System.out.println("...");
    }
}
