import java.net.SocketPermission;
import java.util.Scanner;;
public class pattern19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                
                // first row

                if(i==1){
                    if ((j>=1 && j<=n/2+1) || (j==n))
                    System.out.print("*");
                

                else{
                    System.out.print(" ");
                }
            }
                // 2nd row and middle minus one row

                if(i>1 && i<n/2+1){
                    if(j==n/2+1 || j==n){
                        System.out.print("*");
                    }
                    
                    else{
                        System.out.print(" ");
                    }
                    
                }
                
                // middle row
                if (i==n/2+1){
                    System.out.print("*");
                }

                // middle plus one to bottom minus one
                if(i>n/2+1 && i<n){
                    if (j==1 || j==n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            // bottom row
             if(i==n){
                if(j==1 || (j>=n/2+1 && j<=n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
             }
            
             
          
  
        }
      
        System.out.println();
    }
   
}
}
