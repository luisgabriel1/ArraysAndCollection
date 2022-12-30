package Udemy.Arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        double[] gradeStudentA = new double[3];
        System.out.println(Arrays.toString(gradeStudentA));

        gradeStudentA[0] = 7.9;
        gradeStudentA[1] = 8;
        gradeStudentA[2] = 6.7;

        System.out.println(Arrays.toString(gradeStudentA));

        double totalStudentA = 0;

        for(int i = 0; i < 3; i++){
            totalStudentA += gradeStudentA[i];
            System.out.println(gradeStudentA[i]);
        }

        System.out.println(totalStudentA / gradeStudentA.length);

        double gradeStored = 5.5;
        double [] gradeStudentB  = {6.9, 8.9, gradeStored, 10};

        double totalStudentB = 0;

        for (int i = 0; i < gradeStudentB.length; i++){
            totalStudentB += gradeStudentB[i];
        }

        System.out.println(totalStudentB / gradeStudentB.length);
    }
}
