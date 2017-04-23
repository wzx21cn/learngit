import java.util.Scanner;

/**
 * copyright (C),2016-2020,zhixin.wang This program is protected by copyright
 * laws. 打印近似圆
 * 
 * @author wangzhixin
 * @version 1.0
 * @see java.lang.Object
 */

public class CirclePrinter {

	/**
	 * 入口主方法
	 * 
	 * @param args
	 *            命令行传入参数，不处理
	 */

	public static void main(String[] args) {
		System.out.print("请输入圆半径:");
		// paint(new Scanner(System.in).nextInt());
		init(new Scanner(System.in).nextInt());

	}

	/**
	 * 打印输出近似圆
	 * 
	 * @param r
	 *            圆半径
	 * @return 无
	 */
	public static void paint(int r) {
		// 设置圆心坐标在(r,r)处，控制台起始坐标为(0,0)
		int x = 0; // x坐标
		int y = 0; // y坐标
		int c = 0; // 左右两个*之间的空格/2

		// 打印每一行
		for (y = 0; y <= 2 * r; y += 1) {
			c = (int) Math.round(Math.sqrt(r * r - (r - y) * (r - y)));
			// x = (int)(Math.sqrt(r*r -(r-y) * (r-y)));
			// System.out.println(c + " " + x);

			for (x = 0; x <= 2 * r + 1; x++) {
				// System.out.println(y +" " + x + " " + r + " " + c);
				if (x == (r - c) || (x == (r + c + 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void init(int r) {
		// 定义一个数组，存放要打印内容
		char[][] str = new char[2 * r + 1][2 * r + 1 + 1];

		for (int y = 0; y < str.length; y++) {
			int c = (int) Math.round(Math.sqrt(r * r - (r - y) * (r - y)));
			for (int x = 0; x < str[y].length; x++) {
				if ((x == (r - c)) || (x == (r + c + 1))) {
					str[y][x] = '*';
				} else {
					str[y][x] = ' ';
				}
			}
		}
		// 打印出数组，高宽比为2:1
		int rate = 2;
		for (int i = 0; i <= str.length; i++) {
			if (i % rate == 0) {
				System.out.println(str[i]);
			}
		}
	}
}
