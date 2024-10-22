
public class Ex2_7 {

	public static void main(String[] args) {
		double estimatePi = 0;
		double a[] = new double[2];
		double error = 0;
		int count = 0;
		
		for(int i = 0; i< 1000; i++) {
			a[0] = Math.random();
			a[1] = Math.random();
			
			if(Math.sqrt(a[0]*a[0]+a[1]*a[1])<=1) {
				count++;
			}
		}
		
		estimatePi = 4.0 * count / 1000;
		error = Math.abs((estimatePi - Math.PI)/Math.PI )* 100;

		System.out.println("実際の円周率 : "+Math.PI);
		System.out.println("モンテカルロ法により求められた円周率 : "+estimatePi);
		System.out.println("誤差 : "+error + "%");
	}

}
