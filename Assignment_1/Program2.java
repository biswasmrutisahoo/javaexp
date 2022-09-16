public class Program2 {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("principle=");
        a = sc.nextInt();
        System.out.print("rate=");
        b = sc.nextInt();
        System.out.print("time=");
        c = sc.nextInt();
        d = (a * b * c) / 100;
        System.out.println("the interest is" + d);
    }
}
