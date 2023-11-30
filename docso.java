import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lớn hơn khôn và tối đa 3 số: ");
        int so = sc.nextInt();
        if (so > 0 && so <= 999) {
            int hangtram = so / 100;
            int hangchuc = (so % 100) / 10;
            int donvi = so - hangtram * 100 - hangchuc * 10;
            String[] a = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
            if (hangtram >= 1 && hangchuc == 0 && donvi == 0) {
                System.out.println(a[hangtram] + " trăm");
            } else if (hangtram > 1) {
                System.out.println(a[hangtram] + " trăm " + a[hangchuc] + " " + a[donvi]);
            } else if (hangchuc==1 && donvi!= 0) System.out.println("mười " + a[donvi]);
            else if (hangchuc==1 && donvi==0) {
                System.out.println("mười");
            } else if (hangchuc>1) {
                System.out.println(a[hangchuc] + " mươi " + a[donvi]);
            } else {
                System.out.println(a[donvi]);
            }
        } else {
            System.out.println("Nhập sai ");
        }
    }
}





