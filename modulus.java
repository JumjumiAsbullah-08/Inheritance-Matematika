# Inheritance-Matematika
Tugas Praktikum Pewarisan

package Matematika;
import java.util.Scanner;

public class modulus extends matematika {
     private int c;
        void Modulus (int a, int b){
            Scanner input = new Scanner (System.in);
            System.out.println(" Input Angka Pertama  : ");
            a = input.nextInt();
            System.out.println(" Input Angka Kedua    : ");
            b = input.nextInt();
            
            c = a % b;
            System.out.println(" Hasil Modulus    : " +c);
        }
}
