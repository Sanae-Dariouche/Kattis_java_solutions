import java.util.*;
public class Secret_Message {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        while(N>0)
        {   String res="";
            String s=sc.nextLine();
            int L=s.length();
            int K;
            if(Math.sqrt(L)-(int) Math.sqrt(L)>0) K=(int)Math.sqrt(L)+1;
            
            else K=(int) Math.sqrt(L);
            
            char[][] mat=new char[K][K];
            int c=0;
            for(int i=0;i<K;i++)
            {
                for(int j=0;j<K;j++)
                {   
                    if(c<L) {
                    mat[i][j]=s.charAt(c);}
                    else {mat[i][j]='*';}
                    c++;
                }
            }
            for(int i=0;i<K;i++)
            {
                for(int j=K-1;j>=0;j--)
                {
                    res=res+(mat[j][i]);
                }
            }
            res=res.replace("*", "");
            System.out.println(res);
            N--;
        }
        
    }

}