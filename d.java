import java.util.*;
public class d
{
    public static void main(String args[])
    {
        int[] pk = new int[5];

        for(int i = 0; i<5; i++)
        {
            Scanner s = new Scanner(System.in);
            pk [i] = s.nextInt();
        }
        for(int j = 0; j<5; j++)
        {
            System.out.println(pk [j]);
        }
    }

}
