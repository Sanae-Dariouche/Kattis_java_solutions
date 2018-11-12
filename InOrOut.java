import java.util.*;
public class InOrOut {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
        int j=0;
        while(sc.hasNextDouble()) {
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            int r=(int) sc.nextDouble();
            sc.nextLine();
            
            double xz=0, yz=0;
            double racine=0;
            boolean b=true;
            double xzz=0, yzz=0;
            
            for(int i=0;i<r;i++)
            {   xz=xzz;
                yz=yzz;
                xzz=(xz*xz)-(yz*yz)+ x;
                yzz=(2*xz*yz)+y;
                racine=Math.sqrt((xzz*xzz)+(yzz*yzz));
                if(racine>2) {b=false;
                    break; }
            }
            j++;
            if(b) System.out.println("Case "+j+": IN");
            else System.out.println("Case "+j+": OUT");
        }
    }

}