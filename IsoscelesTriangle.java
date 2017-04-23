
/**
* copyright (C),2016-2020,zhixin.wang
* This program is protected by copyright laws.
* 等腰三角形
* @author wangzhixin
* @version 1.0
* @see java.lang.Object
*/

public class IsoscelesTriangle {
	
	/**
	* 入口主方法
	* @param args 命令行传入参数，不处理
	*/
	
	public static void main(String[] args) {
		
		//定义等腰三角形高度
		int waist = 6;
		//打印每一行
		for(int i = 1; i <= waist; i++) {
			//打印每一列
			for(int j = 1; j <= waist+i-1; j++) {
				if((j >= waist-i+1) && (j <= waist+i-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}