import java.util.Scanner;
public class xeploaihanhkiem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập điểm toán: ");
        int toan =Integer.parseInt(sc.nextLine());

        System.out.print("nhập điểm lý: ");
        int ly =Integer.parseInt(sc.nextLine());

        System.out.print("Nhập điểm hóa: ");
        int hoa = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập điểm văn: ");
        int van =Integer.parseInt(sc.nextLine());

        System.out.print("nhập điểm tiếng anh: ");
        int tienganh = Integer.parseInt(sc.nextLine());

        float tb = (toan+ly+hoa+van+tienganh)/5;
        System.out.println(tb);
        if(tb>=0&&tb<5){
            System.out.println("Xếp loại yếu");
        }else if(tb<6.5) {
            System.out.println("Xếp trung bình");
        }else  if(tb<8){
            System.out.println("Xếp loại khá");
        }else if(tb<9){
            System.out.println("Xếp loại giỏi");
        }else {
            System.out.println("xếp loại xuất sắc");
        }
    }
}
