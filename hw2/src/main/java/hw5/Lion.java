package hw5;

public class Lion extends Wild{
    public Lion(int age, float weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public String makeVoice() {
        return super.makeVoice().concat("Roar").concat(System.lineSeparator());
    }

}
