import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Greedily_Increasing_Subsequence {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String res = "";
        int prev = Integer.MIN_VALUE;
        int count=0;
        String s="";
        int num;
        s=sc.readLine();
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] tab = s.split(" ");
        for(int i =0;i<n;i++)
        {
            num = Integer.parseInt(tab[i]);
            if(num>prev)
            {
                list.add(num);
                prev=num;   
            }
        }
        PrintWriter wr = new PrintWriter(System.out,true);
        wr.println(list.size());
        wr.print(list.get(0));
        for(int i=1;i<list.size();i++)
        {
            wr.print(" "+list.get(i));
        }
        wr.println();
    }
}
