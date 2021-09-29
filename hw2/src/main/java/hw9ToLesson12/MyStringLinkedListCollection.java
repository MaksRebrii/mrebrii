package hw9ToLesson12;

public class MyStringLinkedListCollection implements CustomCollection {
    private Node firstElement;
    private Node lastElement;
    private int size;


    @Override
    public boolean add(String str) {
        if (size == 0) {
            firstElement = new Node(null, str, null);
            lastElement = firstElement;
        } else {
            Node secondLast = lastElement;
            lastElement = new Node(secondLast, str, null);
            secondLast.next = lastElement;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String strToAdd : strArr) {
            add(strToAdd);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        Node nodeToDelete = getNodeByIndex(index);
        Node nodeNext = nodeToDelete.next;
        Node nodePrevious = nodeToDelete.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            lastElement = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            firstElement = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        int index = findNodeByValue(str);
        if(index != -1)
            return delete(index);
        return false;
    }

    @Override
    public String get(int index) {
        return getNodeByIndex(index).value;
    }
//TODO
    @Override
    public boolean contains(String str) {
        return findNodeByValue(str) != -1;
    }

    @Override
    public boolean clear() {
        firstElement = null;
        lastElement = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    //TODO what does this method do?
    @Override
    public boolean trim() {
        getNodeByIndex(size).next = firstElement;
        return true;
    }

    @Override
    public boolean equals(CustomCollection coll) {
        if (this == coll)
            return true;
        if (this.size != coll.size())
            return false;
        for (int i = 0; i < this.size; i++) {
            if ((this.get(i) == null && coll.get(i) != null) || (this.get(i) != null && coll.get(i) == null))
                return false;
            if (this.get(i) != null && coll.get(i) != null && !this.get(i).equals(coll.get(i)))
                return false;
        }
        return true;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index > size) throw new ArrayIndexOutOfBoundsException();
        Node node = firstElement;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private int findNodeByValue(String value){
        Node node = firstElement;
        for (int i = 0; i < size; i++) {
            if (value.equals(node.value)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    private static class Node {

        private Node previous;
        private final String value;
        private Node next;

        public Node(Node previous, String value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }

    }
}
