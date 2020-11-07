/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan35.tunjangan;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        hitungGaji hitungGaji = new hitungGaji();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        hitungGaji.setGaji(scanner.nextDouble());
        
        System.out.print("Status anda? (Menikah/Belum)\t: ");
        hitungGaji.setStatus(scanner.next());
        
        hitungGaji.tampilHasilPerhitungan();
        
    }
    
}
