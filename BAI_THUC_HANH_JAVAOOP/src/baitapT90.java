import java.util.Scanner;

public class baitapT90 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky:");
        chuoi = sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la:");
        for(int i=0;i<chuoi.length();i++){
            kytu= chuoi.charAt(i);
            System.out.println(kytu);
        }
    }
    
}
