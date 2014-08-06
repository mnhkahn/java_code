class TestFor {

	public static void main(String[] args) {
		String[] a = {"hello", ", ", "world"};
		System.out.println(a[0] + a[1] + a[2]);
		
		for (String aa : a) {
			aa += "@";
		}
		System.out.println(a[0] + a[1] + a[2]);
	}
	
}