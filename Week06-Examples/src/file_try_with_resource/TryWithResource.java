package file_try_with_resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {


        try (FileWriter fileWriter = new FileWriter("try-with-resource.txt");       // BUNU YAZARAK fileWriter.close yazmamıza gerek kalmıyor
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        bufferedWriter.write("try with resource example");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

