import java.util.Random;

public class Task2 {
    static void sorting(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }

        }
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int max = 0;
        int min = 101;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
        sorting(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.println("Max= " + max + " Min= " + min);


    }


}