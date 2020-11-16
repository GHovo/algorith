package sorting;

public class BubbleSortingMain {

    public static void main(String[] args) {
        int[] array = {1,2,8,0,3};
        BubbleSorting.bubbleSort(array);
        for (int item : array) {
            System.out.print(item);
        }
    }
}
