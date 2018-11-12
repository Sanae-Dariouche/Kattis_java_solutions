
import java.util.*;
public class Cryptographers_Conundrum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char cmp='P';
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=cmp) sum++;
            //System.out.println(s.charAt(i)+"   "+sum);
            if(cmp=='P') cmp='E';
            else if(cmp=='E') cmp='R';
            else if(cmp=='R') cmp='P';
        }
        System.out.println(sum);
    }

}
