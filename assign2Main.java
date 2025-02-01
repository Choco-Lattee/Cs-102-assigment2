
public class assign2Main {

    public static final int ARRAY_SIZE = 100;

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
        //an array contains random integers in the range [0,100].
        int[] givenArray = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            givenArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(givenArray));
        System.out.println(Arrays.toString(DiffAverage(givenArray)));
        int maximumElementElement = getMaximumOfTheArray(givenArray);
        int minimumElement = getMinimumOfTheArray(givenArray);
        System.out.println("Maximum element of the array is " + maximumElementElement);
        System.out.println("Minimum element of the array is " + minimumElementElement);

        //test sumEvenIndex
        int evenSum = sumEvenIndex(givenArray);
        System.out.println("\nSum of elements at even indices: " + evenSum);

        //test sumOddIndex
        int oddSum = sumOddIndex(givenArray);
        System.out.println("Sum of elements at odd indices: " + oddSum);

        //test sumOddAndEvenIndexes
        int[] sums = sumOddAndEvenIndexes(givenArray);
        System.out.println("\nSum of elements at even indices: " + sums[0]);
        System.out.println("Sum of elements at odd indices: " + sums[1]);
    }
}
