package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {

    protected Object[] data;

    public BaseArray(Object[] data) {
        this.data = data;
    }

    @Override
    public Object[] toArray() {
        return data;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return data.length;
    }

    public void removeAt(int index) {
        int len = size();
        Object[] newData = new Object[len - 1];
        for (int i = 0, j = 0; i < len; ++i) {
            if (i != index) {
                newData[j] = data[i];
                j++;
            }
        }
        data = Arrays.copyOf(newData, len - 1);
    }
}
