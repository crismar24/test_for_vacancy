/*
@Author: Yury
@Date: 03.06.2018

***
Утилита для копирования файлов. На вход программе подается имя копируемого
файла и имя для конечного файла
 */

import java.io.File;

public class CopyFile {
    public static void main(String[] args) {

    }

    void copy(String line) {
        int whiteSpace = line.indexOf("\\s");
        if (whiteSpace < 0) {
            System.out.println("Not correct format of a way to files");
        } else {
            File fileOriginal = new File(line.substring(0, whiteSpace));
            File fileCopy = new File(line.substring(whiteSpace + 1, line.length()));

        }
    }

}
