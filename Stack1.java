package Udemy.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack1 {
    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<>();
        books.add("The little prince");
        books.push("Dom quixote");
        books.push("The Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());

       // books.size();
       // books.clear();
       // books.contains();
       // books.isEmpty();
    }
}
