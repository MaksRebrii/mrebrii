package hw5;

public class Pet extends Animal implements Voice{
    protected String name;
    protected boolean isVaccinated;

    public Pet(int age, float weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String makeVoice() {
        return sayHello().concat("My name is: ").concat(name).concat(System.lineSeparator());
    }
}
