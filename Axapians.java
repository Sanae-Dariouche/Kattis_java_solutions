import java.util.*;
public class Axapians {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w="";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if( w.length()==0) w=w+s.charAt(i);
            else {
                if(w.charAt(j)!=s.charAt(i)) {w=w+s.charAt(i); j++;}
            }
            
        }
        System.out.println(w);
        
    }

}
