public class MatrixPrint {
	public static void main(String args[]){
        int size = 5;
        int m;
        for (int i=0; i<size; i++) {
            for(int j=1; j<=size; j++){
                if (i==j-1) {
                    System.out.printf("%2c ", '*');
                }
                else if (size-i==j) {
                    System.out.printf("%2c ", '*');
                }
                else{
                    m = j+size*i;
                    System.out.printf("%2d ", m);
                }
            }
            System.out.print("\n");
        }
	}
}
