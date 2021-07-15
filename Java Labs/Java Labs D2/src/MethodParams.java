
public class MethodParams {

	public static void main(String[] args) {
		MethodParams mp = new MethodParams();
		
		System.out.println(mp.convertIntToDouble(44));
		
		System.out.println(mp.sum(1.0,2,3));
	}
	public double convertIntToDouble(int num) {
		return (double)num;
	}
		
	public double sum(double num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
}
