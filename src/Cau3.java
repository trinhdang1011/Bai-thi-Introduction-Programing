import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 1 số nguyên và in ra số đảo ngược
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen n :");
        int n = sc.nextInt();
        int rever_num = 0;
        int temp = 0;
        while(n > 0){
            temp = n % 10;
            rever_num = rever_num * 10 + temp;
            n = n /10;
        }
        System.out.println("So dao nguoc cua n la: " + rever_num);

    }
}
