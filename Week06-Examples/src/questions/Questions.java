package questions;

import java.io.*;

public class Questions {
    public static void main(String[] args) throws IOException {

        //BufferedWriter ve BufferedReader kullanılmalı.
        //try-with-resources kuralına uyulmalı!
        //dosya var mı yok mu kontrolü yapılmalı!
        //Array içerisinde bulunan isimleri, dosyaya yazan ve daha sonrasında bunları okuyup başka bir array içerisine atan program.

        String[] names = {"onur", "tuce", "mukemmel", "cift"};
        String [] newNames = new String[names.length];
        String fileName = "question.txt";
        String data;
        File file = new File(fileName);


        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.println("buffered writer");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String name : names) {
                bufferedWriter.write(name);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("buffered reader");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            int i = 0;
            while ((data = bufferedReader.readLine()) != null) {
                newNames[i] = data;
                i++;

            }
        }
        System.out.println("newArray print");
        for (String name : newNames) {
            System.out.println(name);
        }
    }
}