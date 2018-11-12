import java.util.*;
public class Backspace {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] tab=s.toCharArray();
        int c=0; 
        for(int i=s.length()-1;i>=0;i--)
            
        {
            if(tab[i]=='<') {
                c++;
                tab[i]=' ';
            }
            else if(c>0)  {
                 { tab[i]=' '; c--;}
            }
        }
        s=new String(tab);
        s=s.replaceAll(" ", "");
        System.out.println(s);
    }

}
