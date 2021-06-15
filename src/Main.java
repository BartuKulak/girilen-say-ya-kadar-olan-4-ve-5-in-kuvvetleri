import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sınırı Giriniz: ");
        int sayi = input.nextInt();
        for(int i=1;i<sayi;i*=4){
            System.out.println(i);
        }
        for(int j=5;j<sayi;j*=5){
            System.out.println(j);
        }
    }
}
