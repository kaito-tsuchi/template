
public class Ex2_8 {

	public static void main(String[] args) {
		double sum1 = 0;
		double sum2 = 0;
		for(int i = 1; i <=10; i++) {
			sum1 += i;
			sum2 += i*i;
		}
		System.out.println("整数1-10までの和 :" +sum1);
		System.out.println("整数1-10までの二乗和 :" +sum2);
		

	}

}
