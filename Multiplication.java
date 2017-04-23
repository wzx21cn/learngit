
/**
* copyright (C),2016-2020,zhixin.wang
* This program is protected by copyright laws.
* 输入乘法表
* @author wangzhixin
* @version 1.0
* @see java.lang.Object
*/

public class Multiplication {
	
	/**
	* 入口主方法
	* @param args 命令行传入参数，不处理
	*/
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				if(j < i) {
					System.out.print(" ; ");
				}
			}
			System.out.println();
		}

	}
}