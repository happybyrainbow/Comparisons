public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000];
        Help.generateArray(array);              //Array mit Zufallszahlen füllen
        insertionSort(array);
        bSearch(-970, array);
        Help.print(array);                      //Hier: InsertionSort wird auf dem Array ausgeführt

    }

    public static int bSearch(int gesuchteZahl, int[] array) {
        int count = 0;
        int l = array[0];
        int r = array[array.length - 1];
        int mitte = (int)((l + r) / 2);

        while (r <= l) {
            if(mitte == gesuchteZahl) {
                return count;
            }
            if (array[mitte] < gesuchteZahl) {
                mitte /= 2;
                l = mitte + 1;
                count++;
            }
            if (array[mitte] > gesuchteZahl) {
                mitte /= 2;
                r = mitte - 1;
                count++;
            }

        }
        System.out.println(count);
        return count;
    }

    public static void insertionSort(int[] array) {
        //TODO: Implementiere den insertionSort-Algorithmus
        int comparisons = 0;
        int swaps = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            comparisons++;
            while (j > 0 && array[j - 1] > array[j]) {
                int help = array[j];
                array[j] = array[j - 1];
                array[j - 1] = help;
                swaps++;
                comparisons++;
                comparisons++;
                j--;
            }
            if (j > 0)
                comparisons++;
        }

        //System.out.println(comparisons + swaps);
    }

    public static void selectionSort(int[] array) {
        //TODO: Implementiere den SelectionSort Algorithmus.
        int comparisons = 0;
        int swaps = 0;
        int min;
        for (int i = 0; i <= array.length - 2; i++) {
            min = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                comparisons++;
            }
            int help = array[i];
            array[i] = array[min];
            array[min] = help;
            swaps++;
        }


        System.out.printf("Comparisons: %d , Swaps: %d \n", comparisons, swaps);
    }

    public static void bubbleSort(int[] array) {
        //TODO: Implementiere den BubbleSort Algorithmus.
        int comparisons = 0;
        int swaps = 0;
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int help = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = help;
                    swaps++;
                }
                comparisons++;

            }
        }
        System.out.println(comparisons + swaps);
    }


}
//Bubble
//Insertion

