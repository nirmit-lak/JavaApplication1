

package pack;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.*;




public class pair {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		int N = in.nextInt();
		Pair [] drags = new Pair[N];
		for(int i=0;i<N;i++) {
			int req = in.nextInt();
			int rew = in.nextInt();
			drags[i] = new Pair(req,rew);
		}
		Arrays.sort(drags);
		for(int i=0;i<N;i++) {
			if(drags[i].req>=S) {
				System.out.println("NO");
				return;
			}
			else {
				S+=drags[i].rew;
			}
		}
		System.out.println("YES");
	}
	
	private static class Pair implements Comparable<Pair> {
		int req;
		int rew;
		Pair(int req, int rew) {
			this.req=req;
			this.rew=rew;
		}
		public int compareTo(Pair arg0) {
			return Integer.compare(this.req, arg0.req);
		}
	}
}