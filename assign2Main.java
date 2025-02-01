public class assign2Main 
{
    public static void main(String[] args) 
    {   
        final int ARRAY_SIZE = 100;
        //an array contains random integers in the range [0,100].
        int [] givenArray = new int[ARRAY_SIZE];
        for(int i = 0; i < ARRAY_SIZE; i++)
        {
            givenArray[i] = (int)(Math.random() * 100);
        }
    }    
}
