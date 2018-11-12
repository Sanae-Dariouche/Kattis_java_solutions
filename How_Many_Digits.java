import java.util.*;
public class How_Many_Digits {

     static int countDigits(int n)
        {
            if (n <= 1) return 1;
            
            double res =Math.log10(2*Math.PI*n)/2+n*(Math.log10(n/Math.E));
            return (int)res +1;
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int n = sc.nextInt();
            System.out.println((countDigits(n)));
            //System.out.println(Math.log10(n));
        }
    }
}