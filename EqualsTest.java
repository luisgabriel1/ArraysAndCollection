package Udemy.Arrays;

public class EqualsTest {
    public static void main(String[] args) {
        Equals u1 = new Equals();

        u1.name = "Luis Gabriel";
        u1.Gmail = "LuisGabriel@gmail.com";

        Equals u2 = new Equals();
        u2.name = "Luis Gabriel";
        u2.Gmail = "LuisGabriel@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println();

    }
}
