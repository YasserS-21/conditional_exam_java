package org.example;


import java.util.EnumMap;

import static java.lang.Boolean.TRUE;

/**
 * Hello world!
 *
 */
enum MyBoolean {
    TRUE,
    FALSE;
}

public class App {


    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        //System.out.println(checkNumber(10)); // Positive
        //System.out.println(checkNumber(-5)); // Negative
        //System.out.println(checkNumber(0));  //

        // System.out.println(checkAge(20)); // Adult
        // System.out.println(checkAge(16)); // Minor
        // System.out.println(checkAge(18)); // Adult

//        System.out.println(getGrades(95)); // A
//        System.out.println(getGrades(82)); // B
//        System.out.println(getGrades(45)); // F
    }
    public static String checkNumber(int number) {

        if (number > 0) {
            return "Positive";
        }

        if (number < 0) {
            return "Negative";
        }

        return "Zero";
    }

    private static final int AGE_TO_BECOME_ADULT = 18;

    public static String checkAge(int age) {
        if (age >= AGE_TO_BECOME_ADULT) {
            return "Adult";
        } else {
            return "Minor";
        }

    }

    public static String getGrades(int overallGrade) {

        switch (overallGrade/10) {
            case 10: case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }

    }

}
