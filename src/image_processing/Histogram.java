package image_processing;

import java.lang.reflect.Array;

public class Histogram {
   private int[] histogramArray;
   private int row;
   private int column;
   private int min;
   private int max;
   private String header;




    public Histogram(int[] header) {
        this.row = header[0];
        this.column = header[1];
        this.min = header[2];
        this.max = header[3];
        this.histogramArray = new int[max+1];
        this.header = row+" "+column+" "+min+" "+max;
    }


    public void add(int i) {

    histogramArray[i]= ++histogramArray[i];

    }

    public int[] returnhisto(){
        return histogramArray;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getHeader() {
        return header;
    }
}
