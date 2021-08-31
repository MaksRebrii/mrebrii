package hw5;

public class TestClass {
    public static void main(String[] args) {
        Dog dog = new Dog(5, 10, "white", "Rex");
        dog.voice();
        GuideDog guideDog = new GuideDog(6, 15,"black", "Jet", true);
        guideDog.voice();
        Fish fish = new Fish(1, 0.5f, "Gold", "fish");
        fish.voice();
        Wolf wolf = new Wolf(7, 20, "Grey");
        wolf.voice();
    }
}
