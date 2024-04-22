
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Diansariani (2201010254)
 * tgl : 2024-04-22
 */
public class ArrayDim {
    int jdta = 5;
    String[] dteman = new String [jdta];
    Scanner dtIN = new Scanner(System.in);
    
    public void storedata(){
        System.out.println("Isikan Data Teman");
        System.out.println("-----------------");
        
       for (int i = 0; i < jdta; i++){
           System.out.print("Data ke" + (i +1) + ": ");
           dteman[i] = dtIN.nextLine();
       }
    }
    
    public void viewdata(){
        System.out.println("Daftar Teman");
        System.out.println("------------");
        for(int i = 0; i < jdta; i++){
            System.out.println((i + 1) + "." + dteman[i]);
        }
    }
    
    public void editdata(){
        System.out.println("Ubah Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Data Yang Di Ubah");
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        System.out.println("Data Yang Di Ubah: "+dteman[idx]);
        System.out.print("Di Ubah Menjadi: ");
        String newdt = dtIN.nextLine();
        dteman[idx] = newdt;
        System.out.println("Data index ke-"+idx+"telah di ubah");
    }
    
    public void destroydata(){
        System.out.println("Hapus Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Data Yang Di Hapus");
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        dteman[idx] = "";
        System.out.println("Data index ke-"+idx+"telah dihapus");
    }
}
