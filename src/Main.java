import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Sayısını Giriniz: ");
        int dizi;
        dizi = input.nextInt();
//Başlangıç Değişkenleri
        int a=0;
        int b=1;
        int c;
//Başlangıç olarak yazılacak değerler
        System.out.print(a + ",");
        System.out.print(b);
//Döngü
        for (int i=0;i<dizi;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print("," + c);

        }


    }
}