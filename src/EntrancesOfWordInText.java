/*
@Author: Yury
@Date: 29.05.2018

***
Input: e:\some_text.txt test
Output: 25
 */

import java.io.*;
import java.util.regex.Pattern;

public class EntrancesOfWordInText {

    public EntrancesOfWordInText() {
    }

    public static void main(String[] args) {

        args[0] = "e://some_text.txt text";


        quantityEntrancesOfAWordInTheText(args[0]);
    }

    public static int quantityEntrancesOfAWordInTheText(String path) {
        String[] mPath = path.split(" ");
        if (mPath.length == 0) {
            throw new RuntimeException();
        }
        String pathFile = mPath[0];
        String findWord = mPath[1];
        //Pattern.compile()

        File file = new File(pathFile);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    //
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


        return 0;
    }
}
