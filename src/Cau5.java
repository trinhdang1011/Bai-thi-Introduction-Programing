import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh giai phuong trinh bac 2");
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap a : ");
        int a = sc.nextInt();
        System.out.println("Moi nhap b : ");
        int b = sc.nextInt();
        System.out.println("Moi nhap c : ");
        int c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if(delta < 0){
            ptvn();
        }else if(delta == 0){
            ptcnk(a,b);
        }else{
            ptc2npb(a,b,delta);
        }
    }
    private static void ptc2npb(int a, int b, double delta) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Phuong trinh co 2 nghiem phan biet : ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    private static void ptcnk(int a, int b) {
        int x = -b/(2*a);
        System.out.println("Phuong trinh co nghiem kep : x = " + x);
    }
    private static void ptvn() {
        System.out.println("Phuong trinh vo nghiem");
    }
}
