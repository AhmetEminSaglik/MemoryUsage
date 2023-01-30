package org.ahmeteminsaglik;

import org.ahmeteminsaglik.readableformat.ReadableFormat;

public class MemoryUsage {
    private long beforeUsedMemory, afterUsedMemory, usedMemory;

    public void calculateMemoryBeforeProcess() {
        beforeUsedMemory = Utility.calculateFreeMemory();//100
    }

    public void calculateMemoryAfterProcess() {
        afterUsedMemory = Utility.calculateFreeMemory();//90
//        usedMemory = afterUsedMemory - beforeUsedMemory;
        usedMemory = beforeUsedMemory - afterUsedMemory;
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
                "{Byte=" + ReadableFormat.getStringValue(getUsedMemoryByte()) + '}' +
                ",{KB:" + ReadableFormat.getStringValue(getUsedMemoryKB()) + '}' +
                ",{MB:" + ReadableFormat.getStringValue(getUsedMemoryMB()) + '}' +
                ",{GB:" + ReadableFormat.getStringValue(getUsedMemoryGB()) + '}' +
                '}';
    }
}
