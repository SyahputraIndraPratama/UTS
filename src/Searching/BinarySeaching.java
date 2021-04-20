package Searching;

import java.util.Scanner;

public class BinarySeaching {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        int indeksawal = 0;
        int indeksakhir = A.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.print("isi data adalah: ");
        for (int i = 0; i < A.length; i++){
            
            System.out.print(A[i] + " ");
        }    
        System.out.println("");
        System.out.println("");
        
        while ((indeksawal <= indeksakhir) && (ketemu == 0)) {
        point = (indeksawal + indeksakhir) /2;
        System.out.println("indeks pointer :"+ point);
            if (cari == A[point]) {
                ketemu = 1;
                System.out.println("Data " +
                cari + " Telah ditemukan pada index ke " + point);
            }
            
            else if (cari < A[point]) {
                System.out.println("Cari di kiri ");
                indeksakhir = point-1;
            }
            
            else {
                indeksawal = point+1;
                System.out.println("Cari di kanan ");
            }
            
        }
        
    
    if (ketemu == 1)
        System.out.println("kesimpulan : data ditemukan ");
    else
        System.out.println("kesimpulan : data tidak ditemukan");
        System.out.println("Syahputra Indra Pratama");
        System.out.println("2B");
        System.out.println("20090124");
    
   }
}
