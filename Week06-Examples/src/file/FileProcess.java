package file;

import java.io.File;
import java.io.IOException;

public class FileProcess {
    public static void main(String[] args) throws IOException {
        File directory = new File("examples");
        boolean bool = directory.mkdir();       // mkdir klasör oluşturma komutudur!!

        File file = new File(directory,"file.txt");
        bool = file.createNewFile();


        System.out.println("file & folder delete");
        file.delete();
        directory.delete();
    }
}
