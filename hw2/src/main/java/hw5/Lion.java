package hw5;

public class Lion extends Wild{
    public Lion(int age, float weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Roar");
    }
}
