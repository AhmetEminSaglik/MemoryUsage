package org.ahmeteminsaglik;

public class Utility {
    public static long calculateFreeMemory() {
        return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
    public static long divide(long a, int pow) {
        return (long) (a / Math.pow(1024, pow));
    }
}
