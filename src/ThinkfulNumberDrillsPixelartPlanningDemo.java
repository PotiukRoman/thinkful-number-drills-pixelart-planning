class Kata {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize==0;
    }
}


public class ThinkfulNumberDrillsPixelartPlanningDemo {
    public static void main(String[] args) {
        // Testing
        System.out.println(Kata.isDivisible(4050,27));
        System.out.println(Kata.isDivisible(10000,20));
        System.out.println(Kata.isDivisible(10005,1));
        System.out.println(Kata.isDivisible(4066,27));
        System.out.println(Kata.isDivisible(10005,2));

    }

}
