package org.ahmeteminsaglik;

public class MemoryUsage {
    private long beforeUsedMemory, afterUsedMemory, usedMemory;

    public void calculateMemoryBeforeProcess() {
        beforeUsedMemory = Utility.calculateFreeMemory();
    }

    public void calculateMemoryAfterProcess() {
        afterUsedMemory = Utility.calculateFreeMemory();
        usedMemory = afterUsedMemory - beforeUsedMemory;
    }

    public long getUsedMemoryByte() {
        return usedMemory;
    }

    public long getUsedMemoryKB() {
        return Utility.divide(usedMemory, 1);
    }

    public long getUsedMemoryMB() {
        return Utility.divide(usedMemory, 2);
    }

    public long getUsedMemoryGB() {
        return Utility.divide(usedMemory, 3);
    }

    @Override
    public String toString() {
        return "MemoryUsage{" +
                "{Byte="+getUsedMemoryByte()+'}'+
                ",{KB:"+getUsedMemoryKB()+'}'+
                ",{MB:"+getUsedMemoryMB()+'}'+
                ",{GB:"+getUsedMemoryGB()+'}'+
                '}';
    }
}
