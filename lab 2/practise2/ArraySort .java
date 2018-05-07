public class ArraySort {
public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}     
