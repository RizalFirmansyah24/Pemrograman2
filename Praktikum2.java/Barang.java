public class Barang {
    public static void main(String[] args) {
        short a=1000;
        short b=2000;
        short c=3000;
        short d=4000;
        short e=5000;
        int total=a+b+c+d+e;
        System.out.println(total);

        int uang=20000;
        double kembali=(double) uang-(double) total;
        System.out.println(kembali);
    }
}