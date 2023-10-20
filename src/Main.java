import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        int mostFrequentNumber = findMostFrequentNumber(array);
        if (mostFrequentNumber != -1) {
            int maxFrequency = findFrequency(array, mostFrequentNumber);
            System.out.println("The most frequently occurring number is " + mostFrequentNumber + " with a frequency of " + maxFrequency);
        }
        else {
            System.out.println("The array is empty.");
        }
    }
    public static int findMostFrequentNumber(int[] array) {
        int mostFrequentNumber = -1;
        int maxFrequency = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int currentFrequency = findFrequency(array, currentNumber);

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentNumber = currentNumber;
            }
        }
        return mostFrequentNumber;
    }
    public static int findFrequency(int[] array, int number) {
        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                frequency++;
            }
        }
        return frequency;
    }
}
