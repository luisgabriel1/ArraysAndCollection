package Udemy.Arrays;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
       Scanner RequestAll = new Scanner(System.in);

        System.out.println("How many notes: ");
        int amountNotes = RequestAll.nextInt();

        double[] notes = new double[amountNotes];

        for (int i = 0; i < notes.length; i++){
            System.out.println("Inform the note " + (i+1) + ": ");
            notes [i] = RequestAll.nextDouble();
        }

        double total = 0;
        for(double note: notes){
            total += note;
        }

        double average = total / notes.length;
        System.out.println("The average is: " + average + "!");
        RequestAll.close();
    }
}
