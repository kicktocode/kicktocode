package javaBasic;

import java.util.Arrays;

public class InsertElementInArray {


    public static void main(String[] args) {
        int[] orgArr = {5, 2, 9, 1, 7};
        int[] newArr = insertElementV2(orgArr, 4, 2);
        System.out.println("New Arr = " + Arrays.toString(newArr));
    }

    public static int[] insertElement(int[] orgArr, int element, int index) {
        int[] newArray = new int[orgArr.length + 1];
        int j = 0;
        for (int i = 0; i < index; i++) {
            newArray[j++] = orgArr[i];
        }
        newArray[j++] = element;
        for (int i = index; i < orgArr.length; i++) {
            newArray[j++] = orgArr[i];
        }
        return newArray;
    }

    public static int[] insertElementV2(int[] orgArr, int element, int index) {
        int[] newArray = new int[orgArr.length + 1];
        copySubArray(orgArr, 0, index - 1, newArray, 0);
        newArray[index] = element;
        copySubArray(orgArr, index, orgArr.length - 1, newArray, index + 1);
        return newArray;
    }

    public static void copySubArray(int[] srcArr, int fromIndex, int toIndex, int[] tarArr, int tarFromIndex) {
        for (int i = fromIndex, j = tarFromIndex; i <= toIndex; i++, j++) {
            tarArr[j] = srcArr[i];
        }
    }
}
