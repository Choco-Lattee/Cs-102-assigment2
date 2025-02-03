import java.util.Arrays;
import java.util.Scanner;

public class assign2Main {

    public static final int ARRAY_SIZE = 100;

    public static int[] getDifferenceFromAverage(int[] arr){
        int average = getAverage(arr);
        int length = arr.length;
        int[] ret = new int[length];
    
        for(int i = 0; i < length; i++)
            ret[i] = Math.abs(average - arr[i]);
    
        return ret;
    }

    public static int getAverage(int[] arr){
        int sum = 0;
        int length = arr.length;
    
        for(int num : arr){
            sum = sum + num;
        }
    
        return sum / length;
    }

    public static int getMinimumOfTheArray(int[] givenArray) {
        int minimumElement = 100; // no one of the elements can be greater than 100.
        int currentElement;
        for (int i = 0; i < assign2Main.ARRAY_SIZE; i++) {
            currentElement = givenArray[i];
            if (currentElement <= minimumElement) {
                minimumElement = currentElement;
            }
        }
        return minimumElement;
    }

    public static int getMaximumOfTheArray(int[] givenArray) {
        int maximumElement = 0; // no one of the elements can be less than 100.
        int currentElement;
        for (int i = 0; i < assign2Main.ARRAY_SIZE; i++) {
            currentElement = givenArray[i];
            if (currentElement >= maximumElement) {
                maximumElement = currentElement;
            }
        }
        return maximumElement;
    }

    public static int sumEvenIndex(int[] arr) {
        int sum = 0;
        int len = arr.length;

        for (int i = 0; i < len; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumOddIndex(int[] arr) {
        int sum = 0;
        int len = arr.length;

        for (int i = 1; i < len; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] sumOddAndEvenIndexes(int[] arr) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        return new int[]{sumEven, sumOdd};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] givenArray = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            givenArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(givenArray));

        int choice;
        do{
            System.out.print("Array Tools Menu:\r\n" +
                            "1. Find the difference from the average of the array.\n" + 
                            "2. Find the array's minimum and maximum.\n" +
                            "3. Find the sum of elements with odd- and even-numbered indexes.\n" +
                            "4. Exit\n" + 
                            "Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The average of elements is: "+ getAverage(givenArray));
                    System.out.println("The difference from average is: "+ Arrays.toString(getDifferenceFromAverage(givenArray)));
                    break;
                case 2:
                    int maximumElementElement = getMaximumOfTheArray(givenArray);
                    int minimumElement = getMinimumOfTheArray(givenArray);
                    System.out.println("Maximum element of the array is " + maximumElementElement);
                    System.out.println("Minimum element of the array is " + minimumElement);
                    break;
                case 3:
                    int evenSum = sumEvenIndex(givenArray);
                    System.out.println("\nSum of elements at even indices: " + evenSum);
            
                    int oddSum = sumOddIndex(givenArray);
                    System.out.println("Sum of elements at odd indices: " + oddSum);
            
                    int[] sums = sumOddAndEvenIndexes(givenArray);
                    System.out.println("\nSum of elements at even indices: " + sums[0]);
                    System.out.println("Sum of elements at odd indices: " + sums[1]);
                    break;
            }
        }while(choice !=4);
    }
}
