import java.util.*;
public class FizzBuzz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int N=sc.nextInt();
        for(int i=1;i<N+1;i++)
        {
            if(i%X==0 && i%Y==0) System.out.println("FizzBuzz");
            else if(i%X==0) System.out.println("Fizz");
            else if(i%Y==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

}