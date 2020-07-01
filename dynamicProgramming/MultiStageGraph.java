package dynamicProgramming;

public class MultiStageGraph {

	public static void main(String[] args) {
		int stages=4;
		int[][] C = {	
						{0,0,0,0,0,0,0,0,0},
						{0,0,2,1,3,0,0,0,0},
						{0,0,0,0,0,2,3,0,0},
						{0,0,0,0,0,6,7,0,0},
						{0,0,0,0,0,6,8,9,0},
						{0,0,0,0,0,0,0,0,6},
						{0,0,0,0,0,0,0,0,4},
						{0,0,0,0,0,0,0,0,5},
						{0,0,0,0,0,0,0,0,0},						
		};
		int n=8;
		
		int min;
		int cost[]=new int[n+1];
		int d[]=new int[n+1];
		int path[] = new int[stages+1];
		
		cost[n]=0;
		d[n]=n;
		path[1]=1;
		path[stages]=n;
		
		for(int i=n-1; i>=1;i--) {
			min=Integer.MAX_VALUE;
			for(int k = i+1; k<=n; k++) {
				if(C[i][k]!=0 && C[i][k]+cost[k]<min) {
					min=C[i][k]+cost[k];
					d[i]=k;
				}
			}
			cost[i]=min;			
		}
		for(int i=2; i<stages; i++) {
			path[i]=d[path[i-1]];
		}
		for(int i=1; i<=stages; i++) {
			System.out.print(path[i]+"_");
		}
		
	}

}
