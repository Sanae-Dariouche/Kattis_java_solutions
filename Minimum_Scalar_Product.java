import java.math.BigInteger;
import java.util.*;
public class Minimum_Scalar_Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int t=1;
        while(T>0) {
        int n = sc.nextInt();
        long[] tab1 = new long[n];
        long[] tab2 = new long[n];
        for (int i=0;i<n;i++)
        {
            tab1[i]=sc.nextLong();
        }
        for (int i=0;i<n;i++)
        {
            tab2[i] = sc.nextLong();
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        long res=0;
        for(int i = 0 ;i<n;i++) 
        {
            res+= (tab1[i]*tab2[n-i-1]);
        }
        System.out.println("Case #"+(t)+": "+res);
        t++;
        T--;
        }
    }
}