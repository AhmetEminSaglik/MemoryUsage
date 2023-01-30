package org.ahmeteminsaglik;

public class Utility {
    public static long calculateFreeMemory() {
        Runtime r = Runtime.getRuntime();
        return r.maxMemory()-r.totalMemory()+r.freeMemory();
    }
    public static long divide(long a, int pow) {
        return (long) (a / Math.pow(1024, pow));
    }
}
