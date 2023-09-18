package ua.ithillel.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Пропущенное число: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        boolean[] found = new boolean[n + 1];

        for (int num : arr) {
            found[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!found[i]) {
                return i;
            }
        }

        return 0;
    }
}

