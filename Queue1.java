package Udemy.Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer a Add -> add elements in queue.
        // Difference is the behavior when the queue is full.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Get the next element of queue without removing
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // fila.size();
        // fila.contains();
        // fila.clear();
        // fila.isEmpty() -> To find if the queue is empty.
        // fila.poll() ;

        // Poll e Remove -> Get the next element in the queue by removing.

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());



    }
}
