import java.util.*;
public class Trik {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean A=true;
        boolean B=false;
        boolean C=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='A' && (B)) {A=true; B=false;}
            else if (c=='B' && C) {B=true; C=false;}
            else if(c=='C' && A) {C=true; A=false;}
            else if(c=='A' && A) { A=false; B=true;}
            else if (c=='B' && B) {C=true; B=false;}
            else if(c=='C' && C) {A=true; C=false;}
        }
        if(A) System.out.println('1');
        else if(B) System.out.println('2');
        else if(C) System.out.println('3');
    }

}
