import java.util.*;

public class Tarifa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        int d=X;
        while(N>0)
        {
            int l=sc.nextInt();
            d=d+X-l;
            N--;
        }
        System.out.println(d);
    }

}
