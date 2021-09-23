package hw5;

public class Fish extends Pet implements Voice{
    public Fish(int age, float weight, String color, String name) {
        super(age, weight, color, name, false);
    }

    @Override
    public String makeVoice() {
        return "...".concat(System.lineSeparator());
    }
}
