//power of 2
public static boolean isPowOfTwo(int num) {
    return (num > 0) && ((num & (num - 1)) == 0);
}