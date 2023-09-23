import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(max < b){
//
//            max = b;
//        }
//        if(max < c){
//
//            max = c;
//        }
//
//        System.out.println(max + " is the largest num");
//           int max = a;
//        if (b> max){
//            max = b;
//        }
//        if (c> max){
//            max = c;
//        }
//
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}




