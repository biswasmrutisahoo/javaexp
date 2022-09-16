import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        String a,b,c,d;
        System.out.print("Enter name =");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.print("roll=");
        b=sc.nextLine();
        System.out.print("adress=");
        c=sc.nextLine();
        System.out.print("phone=");
        d=sc.nextLine();
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
    }
}
