package hw10ToLesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {

    private static final int COLLECTION_SIZE = 1_000_000;
    private static final int AMOUNT_OF_GETTING_ELEMENTS_FROM_COLLECTION = 100_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //Checking time arrayList
        long beforeArrayList = System.currentTimeMillis();
        fillCollection1MElements(arrayList);
        getNElementsFromCollection(arrayList);
        long afterArrayList = System.currentTimeMillis();

        //Checking time LinkedList
        long beforeLinkedList = System.currentTimeMillis();
        fillCollection1MElements(linkedList);
        getNElementsFromCollection(linkedList);
        long afterLinkedList = System.currentTimeMillis();
        System.out.printf("ArrayList: %d%nLinkedList: %d%n", afterArrayList - beforeArrayList, afterLinkedList - beforeLinkedList);

    }

    public static void fillCollection1MElements(List<Integer> collection) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            collection.add(i);
        }
    }

    public static void getNElementsFromCollection(List<Integer> collection) {
        for (int i = 0; i < AMOUNT_OF_GETTING_ELEMENTS_FROM_COLLECTION; i++) {
            collection.get(new Random().nextInt(COLLECTION_SIZE));
        }
    }


}
