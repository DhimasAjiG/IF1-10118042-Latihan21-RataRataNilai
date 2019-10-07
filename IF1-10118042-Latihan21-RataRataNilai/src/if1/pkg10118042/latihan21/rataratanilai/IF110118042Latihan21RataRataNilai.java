/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan21.rataratanilai;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Menghitung rata-rata nilai dari Jumlah mahasiswa
 */
public class IF110118042Latihan21RataRataNilai {

   
    public static void main(String[] args) {
    int jumlahMhs;
        int[]  nilaiMhs = new int[10];
        double rataNilai = 0 ;
        
        //input
        System.out.print("Masukkan Jumlah mahasiswa : ");
        Scanner Mhs = new Scanner(System.in);
        jumlahMhs = Mhs.nextInt();
        
        //perhitungan dan output
        for(int i= 1 ; i<=jumlahMhs ; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + i + " : ");
            Scanner Nilai = new Scanner(System.in);
            nilaiMhs[i] = Nilai.nextInt();
            rataNilai += nilaiMhs[i];
            
        }
        System.out.println("Rata-rata Nilai dari Mahasiswa adalah : " + (rataNilai / jumlahMhs));
        System.out.println("(Develovep by Dhimas Aji)");
        
        
    }
    
}
