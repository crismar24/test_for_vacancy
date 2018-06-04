/*
@Author: Yury
@Date: 03.06.2018

***
Input: e:\some_text.txt test
Output: 25
 */

public class Calculator {
    public static void main(String[] args) {
//        args = new String[1];
//        args[0] = "4,78+2,22";

        float result = 0;
        try {
            result = calculate(args[0]);
            if (result == 0) {
                throw new RuntimeException("There are not correct input data");
            }else {
                System.out.println(result);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Не ввели данные");
        }
    }

    private static float calculate(String line) {
        float result = 0;
        float first, second;

        int multiplication = line.indexOf("*");
        int division = line.indexOf("/");
        int subtraction = line.indexOf("-");
        int addition = line.indexOf("+");

        if (multiplication > 0) {
            first = Float.valueOf( line.substring(0, multiplication) );
            second = Float.valueOf(line.substring(multiplication + 1, line.length()));
            result = first * second;
            return result;
        }
        if (division > 0) {
            first = Float.valueOf( line.substring(0, division) );
            second = Float.valueOf(line.substring(division + 1, line.length()));
            result = first / second;
            return result;
        }
        if (subtraction > 0) {
            first = Float.valueOf( line.substring(0, subtraction) );
            second = Float.valueOf(line.substring(subtraction + 1, line.length()));
            result = first - second;
            return result;
        }
        if (addition > 0) {
            first = Float.valueOf( line.substring(0, addition) );
            second = Float.valueOf(line.substring(addition + 1, line.length()));
            result = first + second;
            return result;
        }

        return result;
    }
}
