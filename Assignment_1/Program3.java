import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b;
        System.out.println("enter temp. format 1 for F or 2 for C");
        int d=sc.nextInt();
        System.out.print("enter temp.=");
        a=sc.nextDouble();
        if(d==1){
            b=(a-32.0)*(5.0/9.0);
            System.out.println("The temp.="+b+"c");
        }
        else if(d==2){
            b=(a*(9.0/5.0))+32.0;
            System.out.println("The temp.="+b+"f");
        }
    }
    
}
