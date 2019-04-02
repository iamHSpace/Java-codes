import java.util.*;
public class f
{
    {
        public static int dectobin(int n)
        {
            int q,p=1, rem, bin=0;

            while (q = 0)
            {
                return 0;
            }
            while (q =! 0)
            {
                q= n/2;
                rem = n%2;
                bin = bin + rem*p;
                p = p*10;
                return bin;
            }
        }
    }
    public static void main(String args[])
    {
        int [] ps = new int [7];
        for (int i =0; i < 7; i++)
        {
            Scanner s = new Scanner(System.in);
            ps[i] = s.nextInt();
        }
        for(int j=0; j<8; j++)
        {
        for(int i =0;i<6;i++)
        {
            if(ps[i] > ps[i+1])
            {
                ps[i] = ps[i] + ps[i+1];
                ps[i+1] = ps[i] - ps[i+1];
                ps[i] = ps[i] - ps[i+1];

            }
            else
            {
                ps[i] = ps[i];
                ps[i+1] = ps[i+1];
            }
        }
        }
        System.out.println("");
        for(int i =0;i<7;i++)
        {
            System.out.println(ps[i]);
        }

    }
}
