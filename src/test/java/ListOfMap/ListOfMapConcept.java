package ListOfMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class ListOfMapConcept {
	
	@Test
	private void addingMultipleObjects() {
		
		

	}
	
	
	@Test
	private void method() {

		
		List<Map<String,Integer>> list= null;
	int[] num = {5,10,15,20,25,30};
	
	for (int i : num) {
		
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Age", i);
		list.add(map);
	}
	
	System.out.println(list);
	
	}
	
	@Test
	private void method2() {
	    List<Map<String,Integer>> list = new ArrayList<>();  // Initialize the list
	    int[] num = {5,10,15,20,25,30};
	    
	    for (int i : num) {
	        Map<String,Integer> map = new LinkedHashMap<>();
	        map.put("Age", i);
	        list.add(map);
	    }
	    
	    System.out.println(list);
	}


}
