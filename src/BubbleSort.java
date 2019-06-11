import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort{

    public static void main(String[] args) {

        int[] array = {99, 88, 55, 77, 1, 66};

        System.out.print("unsorted data: ");
        printArray(array);

        System.out.print("Sortert order: "); //1,55,66,77,88,99
        bubble_sort(array);

        printArray(array);

    }


    private static void bubble_sort(int[] input) {
        int inputLength = input.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {
                //hvis venstre plads i arrayet er større end højre plads byttes værdierne
                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    is_sorted = false;
                }

            }

            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;

        }

    }

    private static void printArray(int[] data) {
        String result = Arrays.stream(data)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

}