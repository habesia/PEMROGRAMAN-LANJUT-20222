package TUGAS2;
// HABESIA
// 22116031


import java.util.ArrayList;
import java.util.Scanner;
public class DATAMAHASISWA {
    public static void main(String[] args) {

        ArrayList<String>NAMA=new ArrayList<>();
        ArrayList<String>NIM=new ArrayList<>();
        ArrayList<String>ALAMAT=new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do{

            System.out.println(" program data mahasiswa");
            System.out.println("========================");
            System.out.println(" Tambahkan");
            System.out.println(" Tampilkan");
            System.out.println(" cari");
            System.out.println(" Hapus");
            System.out.println(" Keluar");
            System.out.println(" Pilih Menu:");
            pilihan= input.nextInt();

            if (pilihan==1){
                System.out.println(" Masukan nama:");
                String nm=input.next();
                NAMA.add(nm);

                System.out.println(" Masukan nim:");
                String nim=input.next();
                NIM.add(nim);

                System.out.println(" Masukan alamat:");
                String alt=input.next();
                ALAMAT.add(alt);
            } else if (pilihan==2) {
                System.out.println(" data mahasiswa");
                System.out.println("==================");

                for (int i = 0; i < NIM.size(); i++) {
                    System.out.println(i+1+"."+ NIM.get(i));
                }
                System.out.println(" masukan angka 3 untuk melihat data");
            } else if (pilihan==3) {
                System.out.println("masukan data nomor yang ingin di cari");
                int cari=input.nextInt();

                if(cari==1){
                    System.out.println("nama:"+ NAMA.get(0));
                    System.out.println("nim:"+ NIM.get(0));
                    System.out.println("alamat:"+ ALAMAT.get(0));
                }
                if(cari==2){
                    System.out.println("nama:"+ NAMA.get(1));
                    System.out.println("nim:"+ NIM.get(1));
                    System.out.println("alamat:"+ ALAMAT.get(1));
            }
        } else if (pilihan==4) {
                System.out.println(" data mahasiswa");
                System.out.println("==================");

                for (int i = 0; i < NIM.size(); i++) {
                    System.out.println(i+1+"."+ NIM.get(i));
                }
                System.out.println(" masukan nim yang akan di hapus");
                String nim= input.next();
                NIM.remove(nim);
            } else if (pilihan==5) {
                System.out.println("terima kasih");
            }

        }while (pilihan!=5);
    }
}
