package hw5;

public class Animal {
    protected static int counter;
    protected int id;
    protected int age;
    protected float weight;
    protected String color;

    public Animal(int age, float weight, String color) {
        setId();
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void voice(){
        System.out.println("Hello");
    }

    private void setId(){
        this.id = counter++;
    }
}
