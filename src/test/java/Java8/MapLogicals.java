package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapLogicals {
	private void countingWordFrequenciesInString() {
		String text = "automation testing java map java testing automation";
		String[] words = text.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		wordCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

	private void getValueFromMapWithoutUsingEntrySet() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 85);
		map.put("Bob", 75);
		map.put("Charlie", 95);
		map.put("David", 65);
		Set<Entry<String, Integer>> set1 = map.entrySet();
		for (Entry<String, Integer> entry : set1) {
			entry.getKey();
			entry.getValue();
		}
		
		map.entrySet().stream().allMatch(null);
		map.entrySet().stream().anyMatch(null);
		map.entrySet().stream().collect(null);
		map.entrySet().stream().count();
		map.entrySet().stream().distinct();
		map.entrySet().stream().filter(null);
		map.entrySet().stream().findAny();
		map.entrySet().stream().findFirst();
		map.entrySet().stream().flatMap(null);
		map.entrySet().stream().flatMapToInt(null);
		map.entrySet().stream().forEach(null);
		map.entrySet().stream().forEachOrdered(null);
		map.entrySet().stream().iterator();
		map.entrySet().stream().limit(0);
		map.entrySet().stream().map(null);
		map.entrySet().stream().mapMulti(null);
		map.entrySet().stream().mapMultiToInt(null);
		map.entrySet().stream().max(null);
		map.entrySet().stream().min(null);
		map.entrySet().stream().noneMatch(null);
		map.entrySet().stream().parallel();
		map.entrySet().stream().peek(null);
		map.entrySet().stream().reduce(null, null);
		map.entrySet().stream().sequential();
		map.entrySet().stream().skip(0);
		map.entrySet().stream().sorted();
		map.entrySet().stream().spliterator();
		map.entrySet().stream().toArray(null);
		map.entrySet().stream().toList();
		map.entrySet().stream().unordered();

		map.forEach((key, value) -> System.out.println(key + " : " + value));

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = map.entrySet().stream().collect(Collectors.toList());
//		map.entrySet().stream().collect(Collectors.toMap(
//				Map.Entry::getKey,
//				Map.Entry::getValue,
////				LinkedHashMap::new));

	}
	
	private void CountingWordFrequenciesString() {
		String text = "automation testing java map java testing automation";
        String[] words = text.split(" ");
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        wordCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

	class Employee {
	    String name;
	    String department;

	    Employee(String name, String department) {
	        this.name = name;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	}

	public class GroupByDepartment {
	    public static void mainly() {
	        List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "IT"),
	            new Employee("Bob", "HR"),
	            new Employee("Charlie", "IT"),
	            new Employee("David", "Finance"),
	            new Employee("Eve", "HR")
	        );

	        Map<String, List<Employee>> departmentMap = employees.stream()
	            .collect(Collectors.groupingBy(e -> e.department));

	        departmentMap.forEach((dept, empList) -> 
	            System.out.println(dept + ": " + empList));
	    }
	    
	    public class SortMapByValue {
	        public static void main(String[] args) {
	            Map<String, Integer> map = new HashMap<>();
	            map.put("Alice", 85);
	            map.put("Bob", 75);
	            map.put("Charlie", 95);
	            map.put("David", 65);

	            Map<String, Integer> sortedMap = map.entrySet().stream()
	                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
	                .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (e1, e2) -> e1,
	                    LinkedHashMap::new
	                ));

	            sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	        }
	    }

	    public class MergeMaps {
	        public static void main(String[] args) {
	            Map<String, Integer> map1 = new HashMap<>();
	            map1.put("Alice", 50);
	            map1.put("Bob", 40);

	            Map<String, Integer> map2 = new HashMap<>();
	            map2.put("Alice", 30);
	            map2.put("Charlie", 70);

	            Map<String, Integer> mergedMap = new HashMap<>(map1);
	            map2.forEach((key, value) -> 
	                mergedMap.merge(key, value, Integer::sum)
	            );

	            mergedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	        }
	    }

	    public class MostFrequentCharacter {
	        public static void main(String[] args) {
	            String text = "automationtest";
	            Map<Character, Integer> charFrequency = new HashMap<>();

	            for (char c : text.toCharArray()) {
	                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
	            }

	            char mostFrequent = Collections.max(charFrequency.entrySet(),
	                Map.Entry.comparingByValue()).getKey();

	            System.out.println("Most Frequent Character: " + mostFrequent);
	        }
	    }

	    public class NestedMapExample {
	        public static void main(String[] args) {
	            Map<String, Map<String, Integer>> salesData = new HashMap<>();

	            // Adding sales data
	            salesData.put("North", new HashMap<>());
	            salesData.get("North").put("ProductA", 100);
	            salesData.get("North").put("ProductB", 150);

	            salesData.put("South", new HashMap<>());
	            salesData.get("South").put("ProductA", 200);
	            salesData.get("South").put("ProductC", 300);

	            // Display sales data
	            salesData.forEach((region, productMap) -> {
	                System.out.println("Region: " + region);
	                productMap.forEach((product, sales) ->
	                    System.out.println("  " + product + ": " + sales));
	            });
	        }
	    }
	
	    public class ToMapExample {
	        public static void main(String[] args) {
	            Map<String, Integer> map = Map.of(
	                "Alice", 85,
	                "Bob", 75,
	                "Charlie", 95
	            );

	            // Sort by values in descending order and collect into LinkedHashMap
	            Map<String, Integer> sortedMap = map.entrySet().stream()
	                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	                .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (e1, e2) -> e1, // Resolves conflicts, but none here.
	                    LinkedHashMap::new // Maintains sorted order.
	                ));

	            sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	        }
	    }
	   

	    public class ConflictExample {
	        public static void main(String[] args) {
	            // Simulate a list of conflicting entries
	            List<Map.Entry<String, Integer>> entries = List.of(
	                Map.entry("Alice", 85),
	                Map.entry("Bob", 75),
	                Map.entry("Alice", 90) // Key conflict with the first entry
	            );

	            // Use Collectors.toMap to handle conflicts
	            Map<String, Integer> resultMap = entries.stream()
	                .collect(Collectors.toMap(
	                    Map.Entry::getKey,       // Key: "Alice", "Bob", "Alice"
	                    Map.Entry::getValue,     // Value: 85, 75, 90
	                    (e1, e2) -> e1,          // Conflict resolver: keep first value
	                    LinkedHashMap::new       // Maintain insertion order
	                ));

	            System.out.println(resultMap);
	        }
	    }


	}

