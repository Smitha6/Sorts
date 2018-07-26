import java.util.Random;
import java.util.Scanner;

public class HW8 {
    public static void main(String args[]){
        long startTime;
        long endTime;
        int ran;
        Random r = new Random();

        //how many items in list?
        Scanner scanner = new Scanner( System.in );
        System.out.print("What is the size of the array?: ");
        int size = scanner.nextInt();

        Integer[] randomArr = new Integer[size];
        Integer[] ascendingArr = new Integer[size];
        Integer[] descendingArr = new Integer[size];



        //fill random
        for(int i = 0; i < size; i++){
            ran = r.nextInt((100 - 1) + 1);
            randomArr[i] = ran;
        }
        //fill ascending
        for(int i = 0; i < size; i++){
            ascendingArr[i] = i;
        }

        //fill descending
        for(int i = size; i > 0; i--){
            descendingArr[size - i] = i;
        }



        /**---INSERTION SORT---**/
        System.out.println("---INSERTION SORT---");
        //random
        startTime = System.currentTimeMillis();
        Sort.insertionSort(randomArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Insertion Sort - Random Time: " + endTime);

        //ascending
        startTime = System.currentTimeMillis();
        Sort.insertionSort(ascendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Insertion Sort - Ascending Time: " + endTime);

        //descending
        startTime = System.currentTimeMillis();
        Sort.insertionSort(descendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Insertion Sort - Descending Time: " + endTime);


        /**---HEAP SORT---**/
        System.out.println("---HEAP SORT---");
        //random
        startTime = System.currentTimeMillis();
        Sort.heapsort(randomArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Heap Sort - Random Time: " + endTime);

        //ascending
        startTime = System.currentTimeMillis();
        Sort.heapsort(ascendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Heap Sort - Ascending Time: " + endTime);

        //descending
        startTime = System.currentTimeMillis();
        Sort.heapsort(descendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Heap Sort - Descending Time: " + endTime);


        /**---MERGE SORT---**/
        System.out.println("---MERGE SORT---");
        //random
        startTime = System.currentTimeMillis();
        Sort.mergeSort(randomArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Merge Sort - Random Time: " + endTime);

        //ascending
        startTime = System.currentTimeMillis();
        Sort.mergeSort(ascendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Merge Sort - Ascending Time: " + endTime);

        //descending
        startTime = System.currentTimeMillis();
        Sort.mergeSort(descendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Merge Sort - Descending Time: " + endTime);


        /**---QUICK SORT---**/
        System.out.println("---QUICK SORT---");
        //random
        startTime = System.currentTimeMillis();
        Sort.quicksort(randomArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Random Time: " + endTime);

        //ascending
        startTime = System.currentTimeMillis();
        Sort.quicksort(ascendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Ascending Time: " + endTime);

        //descending
        startTime = System.currentTimeMillis();
        Sort.quicksort(descendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Descending Time: " + endTime);


        /**---QUICK SORT 2---**/
        System.out.println("---QUICK SORT 2---");
        //random
        startTime = System.currentTimeMillis();
        Sort.quicksort2(randomArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Random Time: " + endTime);

        //ascending
        startTime = System.currentTimeMillis();
        Sort.quicksort2(ascendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Ascending Time: " + endTime);

        //descending
        startTime = System.currentTimeMillis();
        Sort.quicksort2(descendingArr);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Quick Sort - Descending Time: " + endTime);
    }

}
