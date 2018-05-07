public class ShellSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int h = 1;
        while (h < array.length) h = 3*h + 1;
        while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++){
                for (int i = h+k; i < length; i+=h){
                    int key = array[i];
                    int j = i-h;
                    while (j>=0 && array[j] > key){
                        array[j+h] = array[j];
                        j-=h;
                    }
                    array[j+h] = key;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}    
