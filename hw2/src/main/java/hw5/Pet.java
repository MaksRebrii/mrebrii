package hw5;

public class Pet extends Animal {
    protected String name;
    protected boolean isVaccinated;

    public Pet(int age, float weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.printf("My name is: %s", name);
    }
}
