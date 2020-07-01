package GreedyMethod;
import java.util.*;

class Job {
	String id;
	int profit;
	int deadline;
	public Job() {}
	public Job(String id, int profit, int deadline) {
		this.id=id;
		this.profit=profit;
		this.deadline=deadline;
	}
	public String getID() {
		return id;
	}
	public int getProfit() {
		return profit;
	}
	public int getDeadline() {
		return deadline;
	}
	
}
class Sort1 implements Comparator<Job>
{
	@Override
	public int compare(Job obj1, Job obj2) {
		if(obj1.getProfit()>obj2.getProfit())
			return -1;
		return 1;
	}
}
public class JobSequence {
	public static void jobSequence(List<Job> seq, int maxDead) {
		int n = seq.size();
		
		boolean[] slot= new boolean[maxDead];
		String[] result=new String[maxDead];
		for(int i=0; i<maxDead;i++) {
			slot[i]=false;
		}
		for(int i=0; i<n;i++) {
			int dead = seq.get(i).getDeadline();
			for(int j=dead-1; j>=0;j--) {
				if(slot[j]==false) {
					result[j]=seq.get(i).getID();
					slot[j]=true;
					break;
				}
			}
		}
		for(String i:result) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		String[] id= {"a","b","c","d","e"};
		int[] profit= {100,19,27,25,15};
		int[] deadline= {2,1,2,1,3};
		int maxDead =Arrays.stream(deadline).max().getAsInt(); 
		List<Job> seq= new ArrayList<>();
		for(int i =0; i<id.length;i++) {
			Job job = new Job(id[i],profit[i],deadline[i]);
			seq.add(job);
		}
		Collections.sort(seq, new Sort1());
		for(Job i:seq) {
			System.out.println(i.getProfit());
		}
		jobSequence(seq, maxDead);
}
}

