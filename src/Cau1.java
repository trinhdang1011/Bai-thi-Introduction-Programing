import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        //Tinh va in ra gia tien cua mot bua an
        System.out.println("Chuong trinh tinh gia tien cua mot bua an ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap gia : ");
        double meal_cost = sc.nextDouble();
        System.out.println("Moi nhap % tip : ");
        double tip_percent = sc.nextDouble();
        System.out.println("Moi nhap % tax : ");
        double tax_percent = sc.nextDouble();
        double tip = meal_cost * (tip_percent/100);
        double tax = meal_cost * (tax_percent/100);
        double total_cost = meal_cost + tip + tax;
        System.out.println("Tong tien cua mot bua an la : " + total_cost +" VND");
    }
}
