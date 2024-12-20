package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Logical {

	@Test
	public static void method() {

		Map<String, Integer> map = new HashMap();
		map.put("apple", 50);
		map.put("banana", 20);
		map.put("cherry", 70);
		map.put("date", 30);

	Entry<String, Integer>[] entries = map.entrySet().toArray(new Entry[0]);
		
		for (int i = 0; i < entries.length - 1; i++) {
			for (int j = 0; j < entries.length - i - 1; j++) {
				if (entries[j].getValue() > entries[j + 1].getValue()) {

					Entry<String, Integer> temp = entries[j];
					entries[j] = entries[j + 1];
					entries[j + 1] = temp;
				}
			}
		}

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		for (Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

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
			if (key == 'a') {
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
