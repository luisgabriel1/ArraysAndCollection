package Udemy.Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer a Add -> adicionam elementos na fila.
        // Diferença é o comportamento quando a fila está cheia

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obter o proximo elemento da fila sem remover
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // fila.size();
        // fila.contains();
        // fila.clear();
        // fila.isEmpty() -> Para saber se a fila é vazia.
        // fila.poll() ;

        // Poll e Remove -> obter o proximo elemento da fila removendo.

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());



    }
}
