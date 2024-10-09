package Basics;

public class Pattern3 {

	public static void main(String[] args) {
		int n =4;
		for(int i=0;i<n;i++) {
			int num =1;
			for(int j=0;j<n;j++) {
				if(i<=j) {
					System.out.print(num++);
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
