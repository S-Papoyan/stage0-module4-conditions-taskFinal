package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
        first ^= second;
        second ^= first;
        first ^= second;
        System.out.println(first);
        System.out.println(second);
    }
}
