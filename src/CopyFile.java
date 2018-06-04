/*
@Author: Yury
@Date: 03.06.2018

***
Утилита для копирования файлов. На вход программе подается имя копируемого
файла и имя для конечного файла
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Date;


public class CopyFile {

    public static void main(String[] args) {
//        args = new String[2];
//        args[0] = "E:\\Downloads\\Gringo.2018.WEB-DLRip.1.46Gb.MegaPeer.avi";
//        args[1] = "E:\\Downloads\\Gringo.2018.WEB-DLRip.1.46Gb.MegaPeer-copy111.avi";

        try {
            Date dateStart = new Date();
            copyFiles(new File(args[0]), new File(args[1]));
            Date dateEnd = new Date();
            System.out.println("Время, затраченнное на копирование файла: " + (dateEnd.getTime() - dateStart.getTime()) + " милисекунд");
        } catch (IOException e) {
            e.printStackTrace();
            //System.err.println(e.);
            // TODO описание ошибки ?
        }
    }

    public static void copyFiles(File in, File out) throws IOException {
        FileChannel inChannel = new
                FileInputStream(in).getChannel();
        FileChannel outChannel = new
                FileOutputStream(out).getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(),
                    outChannel);
        } catch (IOException e) {
            throw e;
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }
}

