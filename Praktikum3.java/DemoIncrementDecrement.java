public class DemoIncrementDecrement {
    public static void main(String[] args) {
        int X=1, Y=1, Z=1;

        //nilai awal
        System.out.println("Nilai X : " + X);
        System.out.println("Nilai Y : " + Y);
        System.out.println("Nilai Z : " + Z);

        //Increment
        X++; Y++;
        System.out.println("Nilai X : " + X);
        System.out.println("Nilai Y : " + Y++);
        System.out.println("Nilai Z : " + ++Z);

        System.out.println("Nilai Y : " + Y);

        //Decrement
        X--; Y--;
        System.out.println("Nilai X : " + X);
        System.out.println("Nilai Y : " + Y--);
        System.out.println("Nilai Z : " + --Z);

        System.out.println("Nilai Y : " + Y);
    }
}