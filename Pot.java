import java.io.*;
import java.util.*;
public class B {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        //String[] tab=new String[N];
        long X=0;
        for(int i=0;i<N;i++)
        {   String s=br.readLine();
            
            X=X+(long) Math.pow(Integer.parseInt(s.substring(0, s.length()-1)),Character.getNumericValue(s.charAt(s.length()-1)));
        }
        System.out.println(X);
        
    }

}
