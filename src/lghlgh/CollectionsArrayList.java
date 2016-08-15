package lghlgh;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsArrayList {

	public static void main(String args[]) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println("Forward: " + arrayList.toString());
		
		Collections.reverse(arrayList);
		System.out.println("Reverse: " + arrayList);
		System.out.println("Max: " + Collections.max(arrayList));
		System.out.println("Min: " + Collections.min(arrayList));
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(2);
		arrayList2.add(4);
		arrayList2.add(3);
		arrayList2.add(1);
		arrayList2.add(0);
		Collections.sort(arrayList2);
		System.out.println("Unordered: " + arrayList2);
		System.out.println("Ordered: " + arrayList2);


		





	}
}
