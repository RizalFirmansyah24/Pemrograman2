import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1{
    public static void main(String[]args)throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String kd_barang="", nm_brg="", jumlah="";
        System.out.print("Masukan Kode Barang = ");
            kd_barang = dataIn.readLine();
        System.out.print("Masukan Nama Barang = ");
            nm_brg = dataIn.readLine();
        System.out.print("Masukan Jumlah Barang = ");
            jumlah = dataIn.readLine(); 

        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Kode Barang     : "+ kd_barang);
        System.out.println("Nama Barang     : "+ nm_brg);
        System.out.println("Jumlah Barang   : "+ jumlah); 
        
    }
}