public class ExtraTask {


    public static void main(String[] args) {
        int[] test1 = {3, 2, -2, 5, -3};//Highest pair is 3 -3
        int[] test2 = {1, 1, 2, -1, 2, -1};//Highest pair is 1 -1
        int[] test3 = {1, 2, 3, -4};//lack of pairs
        int[] test4 = {1, 1};//lack of pairs
        highest_pair(test1);
        highest_pair(test2);
        highest_pair(test3);
        highest_pair(test4);
    }

    public static void highest_pair(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int temp_max;
            if (Math.abs(array[i]) > max) {
                temp_max = array[i];
                for (int j = i; j < array.length; j++) {
                    if (array[j] == -temp_max) {
                        max = temp_max;
                    }
                }
            }
        }
        if (max != 0) {
            System.out.println("Highest pair is " + max + " " + -max);
        } else {
            System.out.println("lack of pairs");
        }

    }


}

