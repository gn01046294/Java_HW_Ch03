package Ch03;

public class ch03_2 {

	public static void main(String[] args) {
		// 256559秒 是 幾天幾時幾分幾秒
//
		int n = 256559;
		
     int day = n / ( 60 * 60 * 24 );  //System.out.println(day); //天
     int h = n % ( 60 * 60 * 24);  //System.out.println(h); //剩下83759秒
     int hour = h / (60 * 60 ); //System.out.println(hour); // 小時
     int m = h % (60 * 60 ); //System.out.println(m); //剩下 959秒 
     int min = m / 60; //System.out.println(min);//分 
     int s = m % 60;//System.out.println(s);//秒
     
     
     System.out.println("256559秒=" + day +"天又" + hour+"時又" + min + "分又" + s + "秒" );
     
		int second = n % 60 , minute = n / 60;
		
		
		
		
        
        
	}

}




		