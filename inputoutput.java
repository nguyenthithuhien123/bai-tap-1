import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("\nNhập chiều dài");
        int dai =Integer.parseInt(sc.nextLine());

        System.out.print("\nnhập chiều rộng h1ình chữ nhật");
        int rong =Integer.parseInt(sc.nextLine());

        System.out.printf("\nchu vy hình chữ nhật là: %d",(dai+rong)*2);

    }
}
