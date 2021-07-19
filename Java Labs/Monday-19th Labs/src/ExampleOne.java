
public class ExampleOne {
	public int factoral(int num) {
		if(num <= 0) return 0;
		if(num == 1) return 1;
		
		return num * factoral(num-1);
	}
	public static void main(String[] args) {
		ExampleOne e = new ExampleOne();
		System.out.println(e.factoral(5));
		
	}

}
