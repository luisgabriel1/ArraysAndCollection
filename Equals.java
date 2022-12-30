package Udemy.Arrays;

public class Equals {

    String name;
    String Gmail;

    @Override
    public boolean equals(Object obj) {
        Equals other = (Equals) obj;
        boolean nameEquals = other.name.equals(this.name);
        boolean gmailEquals = other.Gmail.equals(this.Gmail);

        return nameEquals && gmailEquals;
    }
}
