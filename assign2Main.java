public class assign2Main 

{
    public static final int ARRAY_SIZE = 100;

    public static int getMinimumOfTheArray(int [] givenArray) {
        int minimumElement = 100; // no one of the elements can be greater than 100.
        int currentElement;
        for(int i = 0; i < assign2Main.ARRAY_SIZE; i++)
        {
            currentElement = givenArray[i];
            if (currentElement <= minimumElement) {
                minimumElement = currentElement;
            }
        }
        return minimumElement;
    }

    public static int getMaximumOfTheArray(int [] givenArray) {
        int maximumElement = 0; // no one of the elements can be less than 100.
        int currentElement;
        for(int i = 0; i < assign2Main.ARRAY_SIZE; i++)
        {
            currentElement = givenArray[i];
            if (currentElement >= maximumElement) {
                maximumElement = currentElement;
            }
        }
        return maximumElement;
    }
    public static void main(String[] args) 
    {   
        //an array contains random integers in the range [0,100].
        int [] givenArray = new int[ARRAY_SIZE];
        for(int i = 0; i < ARRAY_SIZE; i++)
        {
            givenArray[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(givenArray));
        System.out.println(Arrays.toString(DiffAverage(givenArray)));
        int maximumElementElement = getMaximumOfTheArray(givenArray);
        int minimumElement = getMinimumOfTheArray(givenArray);
        System.out.println("Maximum element of the array is " + maximumElementElement);
        System.out.println("Minimum element of the array is " + minimumElementElement);
}
    }    

