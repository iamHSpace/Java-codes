import java.util.Scanner;
public class c
{
    public static void main(String args[])
    {
        System.out.println("Enter a,b,c for quadratic");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        double p = (b+ Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double q = (b- Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println(p);
        System.out.println(q);
    }
}
