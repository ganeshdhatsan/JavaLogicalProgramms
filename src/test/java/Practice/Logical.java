package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Logical {
	
	@Test
	private void countTheOccuranceOfEachCharacterFromTheString() {
		String given = "ganeshkumar";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println("countTheOccuranceOfcharacterFromTheString " + map);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			if(key=='a') {
				Integer value = entry.getValue();
				System.out.println(value);
			}
		}
	}
	
	@Test
	private void findSpecific() {
		String given = "ganeshkumar";
		

	}


}
