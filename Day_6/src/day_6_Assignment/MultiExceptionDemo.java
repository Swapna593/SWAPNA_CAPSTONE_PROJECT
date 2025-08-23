package day_6_Assignment;

import java.io.*;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            int number = Integer.parseInt(reader.readLine());
            int result = 100 / number;
            System.out.println("Result: " + result);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Problem reading the file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
