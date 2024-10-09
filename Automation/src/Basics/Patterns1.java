1```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````yuyy````````````yyyyyyyyyyyu````````````````````````````y```````yyyyyyyyyyyyyyyyyyyyyy```yyyyyyyyyyyyyyyyyyyyyyyyyyyy`yyyyu`````````````````````````````uy``````yyyyyyyyyyyyy`yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy`````yyu````````````````````````u```````u`u```````u``````````````````````````u`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````u````````````````````````````````u````````````````````````````u```u````u``````u``````````u``````````````````````````````````yuu```````````u```````y1```````````````````````````````package Basics;

public class Patterns1 {

	public static void main(String[] args) {
		int n =4;
		//int num =97;
		char ch='a';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					//char ch = (char)num;
					System.out.print(ch+++" ");
					//num++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
