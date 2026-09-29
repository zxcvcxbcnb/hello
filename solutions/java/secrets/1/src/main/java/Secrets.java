public class Secrets {
    public static int shiftBack(int value, int amount) {
        int a= value >>> amount;
        return a;
    }

    public static int setBits(int value, int mask) {
        int b = value | mask;
        return b;
    }

    public static int flipBits(int value, int mask) {
        int b = value ^ mask;
        return b;
    }

    public static int clearBits(int value, int mask) {
        int a = ~((~value) | mask);
        return a;
    }
}