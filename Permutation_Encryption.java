import java.util.*;
public class Permutation_Encryption {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N>0)
        {   String res="";
            int[] tab=new int[N];
            for(int i=0;i<N;i++)
            {
                tab[i]=sc.nextInt();
            }
            sc.nextLine();
            String s=sc.nextLine();
            while(s.length()%N!=0) {s=s+" ";}
            HashMap<Integer,Character> map=new HashMap();
            int q=N;
            while(s.length()>0) {
            for(int i=1;i<N+1;i++)
            {
                map.put(i, s.charAt(i-1));
            }
            for(int i=0;i<tab.length;i++)
            {
                res=res+map.get(tab[i]);
            }
            s=s.substring(N, s.length());
            }
            System.out.println("'"+res+"'");
            
            N=sc.nextInt();
        }
            
        
    }

}