package Basics;

public class Pattern10 {

	public static void main(String[] args) {
		int n =4;
		int num =1;
		char ch ='a';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					if(j%2==0) {
						System.out.print(ch+++" ");
					}
					else {
						System.out.print(num+++" ");
					}

				}
				else
					System.out.print(" ");
			}
		
			System.out.println();
		}
	}

}
