package hw5;

public class GuideDog extends Dog{

    protected boolean isTrained;

    public GuideDog(int age, float weight, String color, String name, Boolean isTrained) {
        super(age, weight, color, name);
        this.isTrained = isTrained;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("I can take you home");
    }

    public void TakeHome(){
        System.out.println("I'm taking home");
    }
}
