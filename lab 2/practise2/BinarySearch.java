public class BinarySearch {
public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;
		int len = data.length;
		int l=0;
		int r=len-1;
		int m=(r+l)/2;
		while((l<=r) && (data[m]!=numberToFind))
		{
			if(data[m]<numberToFind) {
				l=m+1;
			}
			else if(data[m]>numberToFind){
				r=m-1;
			}
			m=(r+l)/2;
		}
		if(l<=r) {
			System.out.println(m);
		}
		else {
			System.out.println(-1);
		}
	}
}    
