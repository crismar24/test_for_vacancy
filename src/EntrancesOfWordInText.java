/*
@Author: Yury
@Date: 31.05.2018

***
Input: e:\some_text.txt test
Output: 25
 */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntrancesOfWordInText {

    public EntrancesOfWordInText() {
    }

    public static void main(String[] args) {
        args = new String[1];
        args[0] = "e://some_text.txt text";

        System.out.println(quantityEntrancesOfAWordInTheText(args[0]));

    }

    public static long quantityEntrancesOfAWordInTheText(String path) {
        long quantity = 0;
        String[] mPath = path.split("\\s");
        String pathFile = null;
        String findWord = null;
        try {
            pathFile = mPath[0];
            findWord = mPath[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

        File file = new File(pathFile);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
//                    reqular expression
//                    найти все буквы Юникода - "[^\\p{L}$]"
//                    [] - символьный класс
                    Pattern pattern = Pattern.compile("(?U)[^\\p{L}]");
                    String[] massLine = pattern.split(line);
                    for (String s : massLine) {
                        if (s.toLowerCase().equals(findWord)) {
                            quantity++;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            e.printStackTrace();
        }


        return quantity;
    }
}
