package Ch03;

public class ch03_6 {

	public static void main(String[] args) {
		// �Эp�������10������έ��n�P�����ꪺ���n���t��
		double n = 10;
		double b = 10;
		double h = n*b;   //����Ϊ����n
		
		double a = 5;
		//double p = (Math.round(Math.PI * 100 )/100.0);
		double ap = a*a*(Math.round(Math.PI * 100 )/100.0);
		
		double ap1 = (Math.round(ap));
		System.out.println(ap1);
		//double ap = a*a*Math.PI;   //�ꭱ�n
		
		double t = h-ap;
		
		System.out.println(t);

	}

}
