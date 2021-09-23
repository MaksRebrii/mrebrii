package hw5;

public interface Voice {

    String makeVoice();

    default String sayHello(){
        return "Hello, ";
    }
}
