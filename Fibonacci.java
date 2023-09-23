import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.println(a + " " + b);
//
//        for (int i = 2; i <= n; i++){
//            c = a+b;
//            System.out.println(" " + c);
//            a = b;
//            b = c;
//        }
//        int n1=0,n2=1,n3,i;
//        int count = in.nextInt();
//        System.out.print(n1+" "+n2);//printing 0 and 1
//
//        for(i=2;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <=n){
            int temp = b;
            b= b+a;
            a = temp;
            count++;
            System.out.print( b +" " );
        }
        System.out.println();
        System.out.println(b);



    }
}
