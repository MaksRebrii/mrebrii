package hw5;

public class Dog extends Pet{
    public Dog(int age, float weight, String color, String name) {
        super(age, weight, color, name, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("\nWoof");
    }
}
