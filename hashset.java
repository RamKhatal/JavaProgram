package pkg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("mumbai");
		hs.add("pune");
		hs.add("delhi");
		hs.add("kolkatta");
		hs.add("hydrabad");
		System.out.println(hs);
//		hs.remove("delhi");
//		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		
		
		LinkedHashSet ts = new LinkedHashSet();
		ts.add("mumbai");
		ts.add("pune");
		ts.add("delhi");
		ts.add("kolkatta");
		ts.add("hydrabad");
		System.out.println(ts);
		

		TreeSet ps = new TreeSet();
		ps.add("Mumbai");
		ps.add("Pune");
		ps.add("Delhi");
		ps.add("Kolkatta");
		ps.add("Hydrabad");
		System.out.println(ps);

	}

}
