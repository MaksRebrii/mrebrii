package hw5;

public class GuideDog extends Dog implements ExtraSkills{

    protected boolean isTrained;

    public GuideDog(int age, float weight, String color, String name, Boolean isTrained) {
        super(age, weight, color, name);
        this.isTrained = isTrained;
    }

    @Override
    public String makeVoice() {
        return super.makeVoice().concat("I can take you home").concat(System.lineSeparator());
    }

    public void TakeHome(){
        System.out.println("I'm taking home");
    }

    @Override
    public void bringSomething(String thing) {
        System.out.printf("I can bring you %s%n", thing);
    }
}
