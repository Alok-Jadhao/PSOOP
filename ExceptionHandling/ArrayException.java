public class ArrayException {
	public static void main(String[] args) {
		System.out.println("Array out of boud exception: ");
		int[] arr = new int[5];
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
