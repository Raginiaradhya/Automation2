package Basics;

public class Pattern11 {

	public static void main(String[] args) {
		int n =4;
		for(int i=0;i<n;i++) {
			char ch ='a';
			int num =1;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					if(i%2==0) {
						System.out.print(ch++);
					}
					else {
						System.out.print(num++);
					}

				}
				else
					System.out.print(" ");
			}
		
			System.out.println();
		}
	}

}
