package hw5;

public class Hamster extends Pet{
    public Hamster(int age, float weight, String color, String name) {
        super(age, weight, color, name, true);
    }

    @Override
    public void voice() {
        super.voice();
    }
}
