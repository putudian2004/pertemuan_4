
package pertemuan4;

import java.util.Scanner;
/**
 *
 * @author DIANSARIANI 2201010254
 * TGL : 2024-04-22
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDim AD = new ArrayDim();
        Scanner dIN = new Scanner(System.in);
        String bubar = "TIDAK";
        
        do{
            System.out.println("Aplikasi Buku Teman V1.0");
            System.out.println("~~~~~~~~");
            System.out.println("A. Isi Data");
            System.out.println("B. Tampil Data");
            System.out.println("C. Ubah Data");
            System.out.println("D. Hapus Data");
            System.out.println("S. Selesai");
            System.out.println("Pilih Menu : ");
            String ch = dIN.nextLine();

            switch (ch) {
                case "A":
                    AD.storedata();
                    break;
                case "B":
                    AD.viewdata();
                    break;
                case "C":
                    AD.editdata();
                    break;
                case "D":
                    AD.destroydata();
                    break;
                case "S":
                    bubar = "YA";
                    break;
                default:
                    System.out.println("Menu pilihan tidak definisikan");
                    break;
            }
        }while(bubar.equals("TIDAK"));
    }
    
}