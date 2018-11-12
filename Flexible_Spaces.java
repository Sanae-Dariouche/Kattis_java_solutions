import java.util.*;
public class Flexible_Spaces {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int p=sc.nextInt();
        int[] tab=new int[p+2]; 
        List<Integer> list=new ArrayList();
        for(int i=0;i<p;i++)
        {
            tab[i]=sc.nextInt();
        }
        tab[p]=0;
        tab[p+1]=w;
        Arrays.sort(tab);
        for(int i=0;i<p+2;i++)
        {
            int x=tab[i];
            for(int j=i+1;j<p+2;j++)
            {   if(!list.contains(Math.abs(x-tab[j])))
                list.add(Math.abs(x-tab[j]));
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        
    }

}