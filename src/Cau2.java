import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        //Nhap vao n va in ra theo dieu kien
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap n: ");
        int n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("Toi la Trinh Van Dang");

            }else if(n >= 2 && n <= 5){
                System.out.println("Toi khong phai la Trinh Van Dang");
            }else if (n<= 20){
                System.out.println("Toi la Trinh Van Dang");
            }else{
                System.out.println("Toi khong phai la Trinh Van Dang");
            }
        }
    }
}
