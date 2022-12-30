package Udemy.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack1 {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("Dom quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

       // livros.size();
       // livros.clear();
       // livros.contains();
       // livros.isEmpty();
    }
}
