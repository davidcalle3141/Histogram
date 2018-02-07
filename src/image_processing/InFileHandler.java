package image_processing;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InFileHandler {
    private Scanner scanner;
    private File file;
    private int[] header;


    public InFileHandler(String fileName){
        this.file = new File(fileName);
        this.scanner = setScanner(file);
        this.header = scanHeader(scanner);

    }

    private Scanner setScanner(File file) {
        try {Scanner scan = new Scanner(file);
            return scan;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        }
        return null;
    }

    private int[] scanHeader(Scanner scanner){
        int[] header = new int[4];
        for (int i = 0; i< 4; i++){
            header[i]= scanner.nextInt();

        }
        return  header;

    }
    public void computeHistogram(Histogram histogram){
        Scanner scanner = this.scanner;
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            histogram.add(i);
        }


    }
    public void closeFile(){
        this.scanner.close();
    }

    public int[] getHeader() {
        return header;
    }
}