
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;


public class LAB7 {
    public static void main(String[] args) {

        String[] Column_Names = { "sepal_length", "sepal_width", "petal_length", "petal_width" };

        // specify the file path
        String filePath = "iris.csv";

        // create a File object
        File file = new File(filePath); 

        

        try {
            // create a Scanner object to read from the file
            Scanner scanner = new Scanner(file); 

            // create ArrayLists to store the data for each column
            ArrayList<Double> sepalLengths = new ArrayList<>();
            ArrayList<Double> sepalWidths = new ArrayList<>();
            ArrayList<Double> petalLengths = new ArrayList<>();
            ArrayList<Double> petalWidths = new ArrayList<>();

            scanner.nextLine(); // add this line to skip the first line

            // read each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                // String[] line = scanner.nextLine().split(",");

                // System.out.println(line);
                sepalLengths.add(Double.parseDouble(values[0]));
                sepalWidths.add(Double.parseDouble(values[1]));
                petalLengths.add(Double.parseDouble(values[2]));
                petalWidths.add(Double.parseDouble(values[3]));
            }

            // close the scanner
            scanner.close(); 

            // calculate the mean for each column
            double SepalLength_Mean = calculateMean(sepalLengths);
            double SepalWidth_Mean = calculateMean(sepalWidths);
            double PetalLength_Mean = calculateMean(petalLengths);
            double PetalWidth_Mean = calculateMean(petalWidths); 

            // calculate  median for each column
            double SepalLength_Median = calculateMedian(sepalLengths);
            double SepalWidth_Median = calculateMedian(sepalWidths);
            double PetalLength_Median = calculateMedian(petalLengths);
            double PetalWidth_Median = calculateMedian(petalWidths);

            // calculate  mode for each column
            double SepalLength_Mode = calculateMode(sepalLengths);
            double SepalWidth_Mode = calculateMode(sepalWidths);
            double PetalLength_Mode = calculateMode(petalLengths);
            double PetalWidth_Mode = calculateMode(petalWidths); 

            // print the results
            System.out.println("Column Name\tMean\tMedian\tMode");
            System.out.println(Column_Names[0] + "\t" + SepalLength_Mean + "\t" + SepalLength_Median + "\t" + SepalLength_Mode);
            System.out.println(Column_Names[1] + "\t" + SepalWidth_Mean + "\t" + SepalWidth_Median + "\t" + SepalWidth_Mode);
            System.out.println(Column_Names[2] + "\t" + PetalLength_Mean + "\t" + PetalLength_Median + "\t" + PetalLength_Mode);
            System.out.println(Column_Names[3] + "\t" + PetalWidth_Mean + "\t" + PetalWidth_Median + "\t" + PetalWidth_Mode); 

            /// write the results to a CSV file
            PrintWriter writer = new PrintWriter("iris_stats.csv");
            writer.println("Column Name,Mean,Median,Mode");
            writer.println("sepal_length," + SepalLength_Mean + "," + SepalLength_Median + "," + SepalLength_Mode);
            writer.println("sepal_width," + SepalWidth_Mean + "," + SepalWidth_Median + "," + SepalWidth_Mode);
            writer.println("petal_length," + PetalLength_Mean + "," + PetalLength_Median + "," + PetalLength_Mode);
            writer.println("petal_width," + PetalWidth_Mean + "," + PetalWidth_Median + "," + PetalWidth_Mode);
            writer.close();
            System.out.println("Results written to iris_stats.csv file.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } 
   

    // A method that calculates for mean
        public static double calculateMean(ArrayList<Double> data) {
            double sum = 0;
            for (double d : data) {
                sum += d;
            }
            return sum / data.size();
        } 

    // A method that calculated median
        public static double calculateMedian(ArrayList<Double> data) {
            Collections.sort(data);
            int middle = data.size() / 2;
            if (data.size() % 2 == 0) {
                return (data.get(middle) + data.get(middle - 1)) / 2;
            } else {
                return data.get(middle);
            }
            } 

            // A method that calculates mode
            public static double calculateMode(ArrayList<Double> data) {
                double mode = data.get(0);
                int maxCount = 0;
                for (int i = 0; i < data.size(); i++) {
                    double value = data.get(i);
                    int count = 1;
                    for (int j = i + 1; j < data.size(); j++) {
                        if (data.get(j).equals(value)) {
                            count++;
                        }
                    }
                    if (count > maxCount) {
                        mode = value;
                        maxCount = count;
                    }
                }
                return mode;
            }
            





    }


