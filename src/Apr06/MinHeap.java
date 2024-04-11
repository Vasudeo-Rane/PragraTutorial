package Apr06;

import java.util.ArrayList;

public class MinHeap {
    public ArrayList<Integer> heap = new ArrayList<>();
    ;
    public int size;

    public MinHeap() {
        System.out.println("constructor called first");
        // Body of constructor
    }

    public void add(int value) {

        heap.add(value);
        size++;
        bubbleUp();
    }

    private void bubbleUp() {
        // Body of .bubbleUp() method
    }
}


