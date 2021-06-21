# Inheritance-Matematika
Tugas Praktikum Pewarisan

package Matematika;
import java.util.Scanner;

public class matematika {
    private int c;
   void Penambahan(int a, int b){
       Scanner input = new Scanner (System.in);
       
       System.out.println(" Input Angka Pertama  : ");
       a = input.nextInt();
       System.out.println(" Input Angka Kedua    : ");
       b = input.nextInt();
       
       c = a + b;
       System.out.println(" \n Hasil Penambahan     : "+c);
       
   }
   void Perkalian(int a, int b){
       Scanner kali = new Scanner (System.in);
       System.out.println(" \nInput Angka Pertama  :");
       a = kali.nextInt();
       System.out.println(" Input Angka Kedua    : ");
       b = kali.nextInt();
       
       c = a * b; 
       System.out.println(" \n Hasil Perkalian    : "+c);
   }
}
