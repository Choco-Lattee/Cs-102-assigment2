public class assign2Main 
{
    public static final int ARRAY_SIZE = 100;
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
    }    
}
