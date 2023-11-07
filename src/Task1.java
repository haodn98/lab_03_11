// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task1 {
    public static void main(String[] args) {
        int[] practiceArray = new int[10];
        for (int i = 0; i < practiceArray.length; i++){
            practiceArray[i] = practiceArray.length-1-i;
        }
        for(int number: practiceArray){
            System.out.print(number+" ");
        }

    }
}