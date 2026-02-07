public class swap {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println(a=a+b);
        System.out.println(b=a-b);
        System.out.println(a=a-b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a=a^b);
        System.out.println(b=a^b);
        System.out.println(a=a^b);
 }
}
