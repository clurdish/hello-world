// This is a new file

import java.util.Random;

public class Test1
{
    public static void main(String [] args)
    {
        System.out.println("How does this work?");
        System.out.println("Maybe someday I'll figure it out");
        
        String [] unnecessary = new String [10];
        Random rand = new Random();
        
        for(int i=0; i<10; i++)
        {
            unnecessary[i] = Integer.toString(rand.nextInt());
        }
        
        for(String s : unnecessary)
            System.out.println(s);
    }
}
