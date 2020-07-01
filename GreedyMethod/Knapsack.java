package GreedyMethod;
import java.util.*;

class Knap{
	int wt;
	int profit;
	
	public Knap(int wt,int profit) {
		this.wt=wt;
		this.profit=profit;
		
	}
	public int getWeight() {
		return wt;
	}
	public int getProfit() {
		return profit;
	}
	public double getProfitperWt() {
		return profit/wt;
	}
}
class Sort implements Comparator<Knap>
{
	@Override
	public int compare(Knap obj1, Knap obj2) {
		if(obj1.getProfitperWt()>obj2.getProfitperWt()) {
			return -1;
		}
		return 1;
	}
}

public class Knapsack {
	
	public static void main(String[] args) {
		int[] wt= {2, 3, 5,7,1,4,1};
		int[] profit= {10,5,15,7,6,18,3};
		int W= 15;
		List<Knap> knapsack= new ArrayList<>();
		int n = wt.length;
		for(int i=0; i<n; i++) {
			Knap st = new Knap(wt[i],profit[i]);
			knapsack.add(st);
		}
		Sort abc = new Sort();
		Collections.sort(knapsack, abc);
		int sum=0;
		int proft=0;
		for(Knap i : knapsack) {
			if(sum+i.getWeight()<=W) {
				
					sum+=i.getWeight();
					proft+=i.getProfit();
			}
		}
		System.out.println(sum);
		System.out.println(proft);
	}
}
