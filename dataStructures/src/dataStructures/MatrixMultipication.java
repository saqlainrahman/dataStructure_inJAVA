package dataStructures;

public class MatrixMultipication {
	public void multiplyNormal(int n1,int n2, int[][] A,int m1, int m2, int[][] B) {
		
		int[][] C = new int[n1][m2];
		for(int i=0; i<n1;i++) {				
			for(int j=0; j<m2;j++) {				
				C[i][j]=0;
				for(int k=0; k<n2; k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		show(C);
	}
	public void show(int[][] C) {
		for(int i=0; i<C.length;i++) {
			for(int j=0; j<C[i].length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public int[][] multiplyDnC(int[][] A, int[][] B) {
		int n=A.length;
		int[][] C= new int[n][n];
		if(n==1) {
			C[0][0]=A[0][0]*B[0][0];				
			
		}
		else {
			int[][] A11=new int[n/2][n/2];
			int[][] A12=new int[n/2][n/2];
			int[][] A21=new int[n/2][n/2];
			int[][] A22=new int[n/2][n/2];
			int[][] B11=new int[n/2][n/2];
			int[][] B12=new int[n/2][n/2];
			int[][] B21=new int[n/2][n/2];
			int[][] B22=new int[n/2][n/2];
			
			split(A,A11,0,0);
			split(A,A12,0,n/2);
			split(A,A21,n/2,0);
			split(A,A22,n/2,n/2);
			split(A,B11,0,0);
			split(A,B12,0,n/2);
			split(A,B21,n/2,0);
			split(A,B22,n/2,n/2);
			
//			int[][] C11=add(multiplyDnC(A11,B11),multiplyDnC(A12,B21));
//			int[][] C12=add(multiplyDnC(A11,B12),multiplyDnC(A12,B22));
//			int[][] C21=add(multiplyDnC(A21,B11),multiplyDnC(A22,B21));
//			int[][] C22=add(multiplyDnC(A21,B12),multiplyDnC(A22,B22));
//			
			int [][] M1 = multiplyDnC(add(A11, A22), add(B11, B22));
            int [][] M2 = multiplyDnC(add(A21, A22), B11);
            int [][] M3 = multiplyDnC(A11, sub(B12, B22));
            int [][] M4 = multiplyDnC(A22, sub(B21, B11));
            int [][] M5 = multiplyDnC(add(A11, A12), B22);
            int [][] M6 = multiplyDnC(sub(A21, A11), add(B11, B12));
            int [][] M7 = multiplyDnC(sub(A12, A22), add(B21, B22));
            
            int [][] C11 = add(sub(add(M1, M4), M5), M7);
            int [][] C12 = add(M3, M5);
            int [][] C21 = add(M2, M4);
            int [][] C22 = add(sub(add(M1, M3), M2), M6);
            
			join(C11,C,0,0);
			join(C12,C,0,n/2);
			join(C21,C,n/2,0);
			join(C22,C,n/2,n/2);
		}
		return C;
	}
	private void join(int[][] C, int[][] R, int n, int m) {
		for(int i1=0, i2=n; i1<C.length; i1++, i2++) {
			for(int j1=0, j2=m; j1<C.length; j1++, j2++) {
				R[i2][j2]=C[i1][j1];
			}
		}
	}
	private void split(int[][] A, int[][] R,int n, int m) {
		for(int i1=0, i2=n; i1<R.length; i1++, i2++) {
			for(int j1=0, j2=m; j1<R.length; j1++, j2++) {
				R[i1][j1]=A[i2][j2];
			}
		}
	}
	private int[][] add(int[][] A, int[][] B){
		int[][] C=new int[A.length][A.length];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {
				C[i][j]= A[i][j]+B[i][j];
			}
		}
		return C;
	}
	private int[][] sub(int[][] A, int[][] B){
		int[][] C=new int[A.length][A.length];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {
				C[i][j]= A[i][j]-B[i][j];
			}
		}
		return C;
	}
}
