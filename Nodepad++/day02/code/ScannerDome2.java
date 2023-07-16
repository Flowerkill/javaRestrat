//导包
import java.util.Scanner;


public class ScannerDome2{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("请输入一个整数a：");
		//创建变量接收数据
		int a = sc.nextInt();
		System.out.println("请输入一个整数b：");
		int b = sc.nextInt();
		
		//打印
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b  = " + (a + b));
	}
	
	
}