/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_5;

/**
 *
 * @author Asus X 441B
 */
public class LATIHAN_5 {

    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing );
    }
    public static void main(String[] args) {
        LATIHAN_5 kambingSusu = new LATIHAN_5();
        
        // Menampilkan jumlah kambing yang ada saat progrsm pertsms x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menapilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
        
    }
}
