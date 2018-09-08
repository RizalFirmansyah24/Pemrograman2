public class DemoCasting {
    public static void main(String[] args) {
        byte b = 100;
        int i = b;

        int x =1000;
        byte y = (byte) x;
        System.out.println("Casting int y : " + y);
        
        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting int k : " + k);
        
        j = 10.2;
        int l = (int) j;
        System.out.println("Casting short l : " + l);
        
        j = 10.5;
        short m = (short) j;
        System.out.println("Casting byte m : " + m);
    }
}