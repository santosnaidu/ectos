package SortingMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestsortingMethodusingList {

public static void main(String[] args) {
		
		List<Integer> lisa = new ArrayList<>();
		
		lisa.add(12);   //12 is an Element
		lisa.add(4);  //4 is an Element
		lisa.add(1);
		lisa.add(5);
		lisa.add(20);
		
		Collections.sort(lisa);
		System.out.println(lisa);
	
}
}