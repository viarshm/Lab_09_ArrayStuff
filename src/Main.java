import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Declare an array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate the sum of the values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        // Calculate the average
        double average = (double) sum / dataPoints.length;

        // Display the sum and average with descriptions
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}

// ... (Main2 and other classes remain unchanged)

