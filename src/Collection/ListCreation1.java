

package Collection;

import java.util.*;

public class ListCreation1 {
public static void main(String[] args) {
//	List<String> li=new ArrayList<>();
//	li.add("a");
//	li.add("BAJ");
//	li.add("jsdn");
//	for(String l:li) {
//		if(l.startsWith("b")) {
//			System.out.println(l);
//		}
//	}
	ArrayList<Integer> li=new ArrayList<>();
	li.add(100);
	li.add(3400);
	li.add(5600);
	li.add(466);
	System.out.println(li);
	List<Integer> l1=new ArrayList<>();
	for(int l:li) {
		if(l>100) {
			l1.add(l);
		}
	}
	System.out.println(l1);
}
}
