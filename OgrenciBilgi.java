import java.util.Scanner;
class ogrenciBilgi{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("==Ogrenci Bilgileri==");

    System.out.print("ad:");
    String ad = input.nextLine();

    System.out.print("soyad:");
    String soyad = input.nextLine();

    System.out.print("no:");
    int no = input.nextInt();

    System.out.print("yas:");
    int yas = input.nextInt();

    System.out.print("gpa(0.00-4.00):");
    double gpa = input.nextDouble();

    System.out.printf("\nAdi: %s" , ad);
    System.out.printf("\nSoyad: %s" , soyad);
    System.out.printf("\nNO: %d" , no);
    System.out.printf("\nYas: %d" , yas);
    System.out.printf("\nGPA: %.2f" , gpa);


}
}
