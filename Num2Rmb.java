

/**
 * copyright (C),2016-2020,zhixin.wang This program is protected by copyright
 * laws. 
 * 将浮点数转换为中文读法
 * 
 * @author wangzhixin
 * @version 1.0
 * @see java.lang.Object
 */

class Num2Rmb {
	String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陸", "柒", "捌", "玖"};
	String[] unitArr = {"元", "十", "百", "千", "万", "十", "百", "千", "亿"};
	
	public String toHanStr(String numStr) {
		// StringBuffer sb = new StringBuffer();
		String result = "";
		int numLen = numStr.length();
		for(int i =0;i <numLen; i++) {
			int pos = Character.getNumericValue(numStr.charAt(i));
			if (pos != 0 && numLen>1) {
			result += hanArr[pos];
			}
			
			if(numLen <= unitArr.length) {
				result += unitArr[numLen-i-1];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Num2Rmb nr = new Num2Rmb();
		System.out.println(nr.toHanStr("124707532"));
		System.out.println(nr.toHanStr("0"));
	}
}