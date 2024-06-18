import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		int[] array = {10, 77, 10, 54, -11, 10};
		System.out.println("Array value : " + Arrays.toString(array));
		int searchNum = 10;
		int total = 30;
		int j = 0;
		for(int x:array) {
			
			if(x == searchNum) {
				j=j+x;
			}		
		}
		if(j== total) {
		System.out.println("Sum is : "+ j);
		}
	}
}
