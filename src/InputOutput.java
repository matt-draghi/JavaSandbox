import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class InputOutput {

    public static void readWrite() throws IOException {
        File inputFile = new File("Resources/input.txt");
        //When using backslashes in the file path, you need to use double
        //File inputFile = new File("Resources\\input.txt");

        Scanner input = new Scanner(inputFile);
        double total = 0;

        while(input.hasNextDouble()){
            double value = input.nextDouble();
            total += value;
//            System.out.println(value);
        }

        PrintWriter out = new PrintWriter("Resources/output.txt");
        out.println("Hello, world!");
        out.printf("Total: %8.2f\n", total);

        out.close();
        input.close();

        //Reading web pages
        String address = "https://matthew-draghi.com/";
        URL pageLocation = new URL(address);
        Scanner in = new Scanner(pageLocation.openStream());
        while(in.hasNext()) {
//            System.out.println(in.next());
        }

        in.close();
    }

    public static void textInputOutput() throws FileNotFoundException {
        File inputFile = new File("Resources/input.txt");

        Scanner in1 = new Scanner(inputFile);
        //This will only read just the words in a file and discard anything that isn't a letter
        //The below pattern separates words to "any sequence of characters other than letters"
        in1.useDelimiter("[^A-Za-z]+");
//        while(in1.hasNext()){
//            System.out.println(in1.next());
//        }

        Scanner in2 = new Scanner(inputFile);
        //To read characters one at a time, you would use this delimiter
        in2.useDelimiter("");
        //Now each call to next returns a string consisting of a single character
//        while(in2.hasNext()){
//            char ch = in2.next().charAt(0);
//            System.out.println(ch);
//        }

        //Character classification
//        while(in2.hasNext()){
//            char ch = in2.next().charAt(0);
//            if(Character.isDigit(ch)){
//                System.out.println("Digit: " + ch);
//            }
//            else if(Character.isUpperCase(ch)){
//                System.out.println("Upper Case: " + ch);
//            }
//            else if(Character.isLetter(ch)){
//                System.out.println("Letter: " + ch);
//            }
//            else if(Character.isLowerCase(ch)){
//                System.out.println("Lower Case: " + ch);
//            }
//            else if(Character.isWhitespace(ch)){
//                System.out.println("WhiteSpace: " + ch);
//            }
//        }

        //Reading Lines
        File lineReader = new File("Resources/ReadingLines.txt");
        Scanner in3 = new Scanner(lineReader);

//        while(in3.hasNextLine()){
//            String line = in3.nextLine();
//
//            int i = 0;
//            while(!Character.isDigit(line.charAt(i))){i++;}
//
//            String countryName = line.substring(0, i);
//            String population = line.substring(i);
//
//            //The trim() method returns the string with all whitespace at the beginning and end removed
//            countryName = countryName.trim();
//            System.out.println(countryName);
//        }

        while(in3.hasNextLine()) {
            String countryName = in3.next(); //Read the first word
            //Add more words to the countryName until a number is encountered
            while (!in3.hasNextInt()) {
                countryName = countryName + " " + in3.next();
            }

//            int populationValue = in3.nextInt();
            int populationValue = Integer.parseInt(in3.next());

            System.out.println(countryName + ": " + populationValue);
        }

        String[] items = {"Cookies", "Linguine", "Clams"};
        Double[] prices = {3.20, 2.95, 17.29};

        for(int i = 0; i < items.length; i++) {
            System.out.printf("%-10s%10.2f", items[i] + ":", prices[i]);
        }
    }

}
