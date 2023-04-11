import java.net.SocketPermission;
import java.util.Scanner;;
public class table {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
           System.out.println(n+ " * "+ i+ " = "+ n*i ); 
        }
    }
}
