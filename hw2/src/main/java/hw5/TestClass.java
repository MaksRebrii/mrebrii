package hw5;

public class TestClass {
    public static void main(String[] args) {
        Dog dog = new Dog(5, 10, "white", "Rex");
        System.out.println(dog.makeVoice());
        GuideDog guideDog = new GuideDog(6, 15,"black", "Jet", true);
        System.out.println(guideDog.makeVoice());
        Fish fish = new Fish(1, 0.5f, "Gold", "fish");
        System.out.println(fish.makeVoice());
        Wolf wolf = new Wolf(7, 20, "Grey");
        System.out.println(wolf.makeVoice());
    }
}
