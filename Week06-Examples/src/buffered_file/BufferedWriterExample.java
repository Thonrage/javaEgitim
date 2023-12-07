package buffered_file;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\ulger\\Desktop\\testfile\\fileWriter.txt";
        FileWriter fileWriter = new FileWriter(fileName,true); //append true yapılırsa üstüne ekleyerek yazar. ,true komutu olmazsa her seferinde baştan yazar!!
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("hello");
        bufferedWriter.newLine();
        bufferedWriter.write("world");

        //fileWriter.close();
        bufferedWriter.close();


        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println("bufferedreader ile okunuyor");
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
        }
        fileReader.close();
        bufferedReader.close();

    }
}
