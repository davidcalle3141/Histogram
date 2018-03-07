package image_processing;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String inputFile= args[0];
        String outputFile = args[1];

    FileWrtiter fileWrtiter = new FileWrtiter();

    InFileHandler inFileHandler= new InFileHandler(inputFile);
    Histogram histogram = new Histogram(inFileHandler.getHeader());
    inFileHandler.computeHistogram(histogram);
    inFileHandler.closeFile();
    fileWrtiter.writeArray(histogram.returnhisto(),histogram.getHeader(), new File(outputFile));
    histogram.returnhisto();
    




    }
}
