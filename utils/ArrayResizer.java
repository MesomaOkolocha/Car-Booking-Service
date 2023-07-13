package utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayResizer {
    //helper method to help resize array
    public static Object increaseSize(Object array, int newSize) {
        Class<?> arrayType = array.getClass().getComponentType();
        Object newArray = Array.newInstance(arrayType, newSize);
        System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
        return newArray;
    }
}

