import java.util.*;
public class Simple_Addition {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String res="";
        int len;
        if(a.length()>b.length() ){
            len=a.length();
            while(b.length()<len) {
                b="0"+b;
            }
        }
        else {
            len=b.length();
            while(a.length()<len) {
                a="0"+a;
            }
        }
        
        int reste=0;
        int sum=0;
        for(int i=len-1;i>=0;i--)
        {
            sum=Character.getNumericValue(a.charAt(i)) +Character.getNumericValue(b.charAt(i))+reste;
            
            if (sum>9) {reste=1;
            sum=sum-10;}
            
            else reste=0;
            
            res=sum+res;
            
            if(i==0 && reste>0) res=1+res;
        }
        System.out.println(res);
    }

}