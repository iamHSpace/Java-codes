import java.util.*;
public class e
{
    public static void main(String args[])
    {
        int [] ps = new int [7];
        int [] pk = new int [7];

        for(int i =0; i<7; i++)
        {
            Scanner s =  new Scanner(System.in);
            ps[i]=s.nextInt();
        }
        for (int i = 0; i<7; i++)
        {
            pk[i] = ps[i] + 2;
        }
        for(int i=0; i<7; i++)
        {
            System.out.println(pk[i]);
        }
    }
}
