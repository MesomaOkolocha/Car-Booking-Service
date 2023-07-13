package utils;

public final class NullChecker {
    private NullChecker(){}
    //check if an object in an array is null
    public static boolean nullChecker(Object[] array) {
        for (Object element : array) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }
}
