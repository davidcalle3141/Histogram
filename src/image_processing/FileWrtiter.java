package image_processing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrtiter {
    File outFile;
    private String dir;
    FileWrtiter(){

    }

    public void writeArray(int[] A, String header, File writeTo){
        FileWriter fwriter = null;
        BufferedWriter writer = null;

        try{
            fwriter = new FileWriter(writeTo, true);
            writer = new BufferedWriter(fwriter);
            writer.write(header);

            int count = 0;
            for (int child: A) {
                writer.newLine();
                writer.write(count+" "+Integer.toString(A[count]));
                count++;

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}