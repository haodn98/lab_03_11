public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] = (i == j) ? i : 0;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Sum = "+sum);
    }
}
