/*
@Author: Yury
@Date: 03.06.2018

***
Input: e:\some_text.txt test
Output: 25
 */

public class Calculator {
    public static void main(String[] args) {

        float result = calculate(args[0]);
        try {
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("There are no input data");
        }
        if (result == 0) {
            throw new RuntimeException("There are not correct input data");
        }
    }

    private static float calculate(String line) {
        float result = 0;
        float first, second;

        int multiplication = line.indexOf("*");
        int division = line.indexOf("/");
        int subtraction = line.indexOf("-");
        int addition = line.indexOf("+");

        first = Float.valueOf( line.substring(0, multiplication - 1) );
        second = Float.valueOf(line.substring(multiplication + 1, line.length()));

        if (multiplication > 0) {
            result = first * second;
            return result;
        }
        if (division > 0) {
            result = first / second;
            return result;
        }
        if (subtraction > 0) {
            result = first - second;
            return result;
        }
        if (addition > 0) {
            result = first + second;
            return result;
        }

        return result;
    }
}
