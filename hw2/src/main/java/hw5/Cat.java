package hw5;

public class Cat extends Pet{
    public Cat(int age, float weight, String color, String name) {
        super(age, weight, color, name, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("\nMeow");
    }
}
