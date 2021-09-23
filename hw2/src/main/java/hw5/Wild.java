package hw5;

public class Wild extends Animal implements Voice{
    protected boolean isPredator;

    public Wild(int age, float weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String makeVoice() {
        StringBuilder result = new StringBuilder();
        result.append(sayHello()).append("I'm a wild animal. ");
        if(isPredator)
            result.append("And I'm predator");
        result.append(System.lineSeparator());
        return result.toString();
    }
}
