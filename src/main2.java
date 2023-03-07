//import java.util.Scanner;
//
//public class main2 {
//    public static void main(String[] args) {
//        int height;
//        int width;
//        int i;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("height = ");
//        height = sc.nextInt();
//        System.out.print("width = ");
//        width = sc.nextInt();
//
//        for(i = 1; i <= height; i++){
//            for(int j = 1; j <= width; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println("");
//        }
//
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int hight, k = 0;
//        System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
//        hight = sc.nextInt();
//        for (int i = 1; i <= hight; ++i, k = 0) {
//            for (int space = 1; space <= hight - i; ++space) {
//                System.out.print("  ");
//            }
//            while (k != 2 * i - 1) {
//                System.out.print("* ");
//                ++k;
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n----------------------------------");
//        System.out.println("Chương trình này được đăng tại Freetuts.net");
//    }
//}
