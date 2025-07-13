import java.io.*;

public interface Calculator {
    public double calculate(double a,double b);
    public default void  addToLogFile(String inputString, FileWriter logWriter, FileReader  logReader) throws IOException {
    }
}
