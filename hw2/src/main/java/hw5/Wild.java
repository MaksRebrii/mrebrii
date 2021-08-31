package hw5;

public class Wild extends Animal{
    protected boolean isPredator;

    public Wild(int age, float weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("I'm a wild animal");
        if(isPredator)
            System.out.println("And I'm predator");
    }
}
