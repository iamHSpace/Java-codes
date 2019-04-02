import java.util.Scanner;
public class b
{
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your numbers");
    int p = s.nextInt();
    int q = s.nextInt();

    int c = p%10;
    int d = q%10;

    if( c == d)
    {
        System.out.println("same last digit");
    }
    else
    {
        System.out.println("different last digits");
    }


}
}
