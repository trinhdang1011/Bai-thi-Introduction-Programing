import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tim gia tri lon nhat va nho nhat cua mot mang 10 so nguyen");
        System.out.println("=======================================================================");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>(10);
        int a[] = new int[10];
        Random rd = new Random();
        int max = 0;
        for (int i = 0; i < 10; i++) {
             a[i] = rd.nextInt(50);
             arr.add(a[i]);
        }
        System.out.println("Cac phan tu trong mang la : " + arr);
        for (int i = 0; i < 10; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("So lon nhat trong mang la : " + max);
        int min =a[0];
        for (int i = 0; i < 10; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("So nho nhat trong mang la : " + min);

    }
}
