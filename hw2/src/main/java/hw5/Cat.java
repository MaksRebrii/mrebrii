package hw5;

public class Cat extends Pet{
    public Cat(int age, float weight, String color, String name) {
        super(age, weight, color, name, true);
    }

    @Override
    public String makeVoice() {
        return super.makeVoice().concat("Meow").concat(System.lineSeparator());
    }
}
