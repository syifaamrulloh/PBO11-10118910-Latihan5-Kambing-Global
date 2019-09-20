/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10118910.latihan5;

/**
 *
 * @author ADMIN
 * NAMA : Muhamad Syifa Amrulloh 
 * KELAS : PBO11K 
 * NIM : 10118910
 *
 * Description Program : Program ini Berisi pengunaan method Kambing Global
 */
public class PBO1110118910Latihan5 {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
    
    public void getjumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " +jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBO1110118910Latihan5 kambingSusu = new PBO1110118910Latihan5();
        
        //Menampilkan jumlah Kambing yang ada saat program pertama berjalan
        kambingSusu.getjumlahKambing();
        
        //Menambah Lima Kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan Jumlah Kambing yang ada
        kambingSusu.getjumlahKambing();
    }
    
}
