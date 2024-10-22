
public class Ex2_6 {

	public static void main(String[] args) {
		double a[] = new double[3];
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		double sum = 0.0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i] * a[i];
		}
		System.out.println("ベクトルの大きさ:" + Math.sqrt(sum));

	}

}
