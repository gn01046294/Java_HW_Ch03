package Ch03;

public class ch03_2 {

	public static void main(String[] args) {
		// 256559�� �O �X�ѴX�ɴX���X��
//
		int n = 256559;
		
     int day = n / ( 60 * 60 * 24 );  //System.out.println(day); //��
     int h = n % ( 60 * 60 * 24);  //System.out.println(h); //�ѤU83759��
     int hour = h / (60 * 60 ); //System.out.println(hour); // �p��
     int m = h % (60 * 60 ); //System.out.println(m); //�ѤU 959�� 
     int min = m / 60; //System.out.println(min);//�� 
     int s = m % 60;//System.out.println(s);//��
     
     
     System.out.println("256559��=" + day +"�ѤS" + hour+"�ɤS" + min + "���S" + s + "��" );
     
		int second = n % 60 , minute = n / 60;
		
		
		
		
        
        
	}

}




		