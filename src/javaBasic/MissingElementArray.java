package javaBasic;

import java.util.Arrays;

public class MissingElementArray {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 6, 7};
        String[] letters = {"a", "b", "c", "e"};
        missingLetter(letters);
    }

    public static void missingLetter(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = diffInLetter(arr[i], arr[i + 1]);
            System.out.println("Diff between " + arr[i] + " and " + arr[i + 1] + " letter = " + diff);
            if (diff > 1) {
                System.out.println("Missing element is " + (char) (arr[i].charAt(0) + 1));
                break;
            }
        }
    }

    public static int diffInLetter(String first, String second) {
        return second.charAt(0) - first.charAt(0);
    }

    public static void missingNumber(int[] arr) {
        System.out.println("Array " + Arrays.toString(arr));
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                System.out.println("Missing element is " + (arr[i] + 1));
                break;
            }
        }
    }
}
