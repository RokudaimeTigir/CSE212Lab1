
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		//String[str] = new String[10];
		
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = i*10;
		}
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
