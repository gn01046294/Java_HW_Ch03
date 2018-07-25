package Ch03;

public class ch03_7 {

	public static void main(String[] args) {
		// 用System.out.println()敘述 5 + 5、5+'5'、5+"5"
		//System.out.println("兩個運算元都不是String,會被自動轉換成String物件,並進行字串串接");
		
System.out.println(5+5);
System.out.println("括胡內兩數值型態相同,故直接相加");
System.out.println(5+'5');
System.out.println("5為常數,'5'為char字元型態,其值為53,故5+53=58");int n ='5';System.out.println(n);
System.out.println(5+"5");
System.out.println("字串可以和任何物件進行+運算(字串串接)所以是55");


	}

}
