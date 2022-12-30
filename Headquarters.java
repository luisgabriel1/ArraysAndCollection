package Udemy.Arrays;

import java.util.Scanner;

public class Headquarters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students ?  ");
        int amountStudents = input.nextInt();

        System.out.println("How many notes per students?  ");
        int amountNotes = input.nextInt();

        double[][] notesOfGruop = new double [amountStudents] [amountsNotes];

        double total = 0;
        for (int a = 0; a < notesOfGroup.length; a++){
            for(int n = 0 ; n < notesOfGroup[a].length; n++){
                System.out.printf("Inform the notes %d of students %d ", n + 1, a + 1 );
                notesOfGroup[a] [n] = input.nextDouble();
                total += notesOfGroup [a] [n];
            }
        }
        double average = total / amoutStudents * amountNotes;
        System.out.println("Average of group is: " + average);
        input.close();
    }
}
