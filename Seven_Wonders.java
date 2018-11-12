import java.util.Scanner;
public class Seven_Wonders {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int nT=0,nC=0,nG=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='T') nT++;
            else if(s.charAt(i)=='C') nC++;
            else if(s.charAt(i)=='G') nG++;
        }
        int n=Math.min(nT, nC);
        int sum=nT*nT+nC*nC+nG*nG+Math.min(n, nG)*7;
        System.out.println(sum);
    }

}
