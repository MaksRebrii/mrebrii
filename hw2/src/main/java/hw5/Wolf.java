package hw5;

public class Wolf extends Wild{
    public Wolf(int age, float weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public String makeVoice() {
        return super.makeVoice().concat("Howl").concat(System.lineSeparator());
    }
}
