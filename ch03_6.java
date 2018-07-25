package Ch03;

public class ch03_6 {

	public static void main(String[] args) {
		// 請計算邊長為10的正方形面積與內接圓的面積的差值
		double n = 10;
		double b = 10;
		double h = n*b;   //正方形的面積
		
		double a = 5;
		//double p = (Math.round(Math.PI * 100 )/100.0);
		double ap = a*a*(Math.round(Math.PI * 100 )/100.0);
		
		double ap1 = (Math.round(ap));
		System.out.println(ap1);
		//double ap = a*a*Math.PI;   //圓面積
		
		double t = h-ap;
		
		System.out.println(t);

	}

}
