//This program demonstrates Matrix Operations in Java, including: 1️⃣ Transpose of a Matrix
2️⃣ Diagonal Elements
3️⃣ Lower Triangular Matrix

public class Matrix_types {
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Transpose of matrix: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("Diagnol of the matrix:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j)
					System.out.println(a[i][j] + " ");
			}
		}
		System.out.println("LOwer transpose:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
