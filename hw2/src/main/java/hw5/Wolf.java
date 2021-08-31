package hw5;

public class Wolf extends Wild{
    public Wolf(int age, float weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Howl");
    }
}
