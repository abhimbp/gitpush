import java.util.Scanner;
import java.util.function.DoubleToIntFunction;;
public class pattern17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  
        int nst=1;
        int nsp=n/2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++)
            if(i==n/2+1){
                System.out.print("*\t");
            }else {

           
               System.out.print("\t");
            }
            for (int k=1; k<=nst;k++){
                System.out.print("*\t");
            }
            if(i<=n/2){ 
                nst++;
            }
            else {
            nst--;
            }
            System.out.println();
        }


    }
}

