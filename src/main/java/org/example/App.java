package org.example;


public class App {

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
