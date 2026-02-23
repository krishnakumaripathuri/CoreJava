package Collect;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	public void HashMapTest() { // it is synchronised but parallel way it will execute //

		// panNum id
		// key value
		Map<String, String> map = new HashMap<String, String>();
		map.put("BHAS012TS", "Bharath"); // entry //
		map.put("KRS7416KA", "Krishna");
		map.put("DAN9505YEL", "DANIYELU");
		map.put("BHAS012TS", "BHARGAVI");
		map.put("MAR9505AM", "THABITHA"); // it allows duplicate names but duplicate ids or pan numbers its not allow //
		map.put(null, "THABITHA");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);

		}
	}

	public void LinkedMapText() { // order should be followed one by one
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("BHAS012TS", "Bharath"); // entry //
		map.put("KRS7416KA", "Krishna");
		map.put("DAN9505YEL", "DANIYELU");
		map.put("BHAS012TS", "BHARGAVI");
		map.put("MAR9505AM", "THABITHA"); // it allows duplicate names but duplicate ids or pan numbers its not allow //
		map.put(null, "THABITHA");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);

		}

	}

	public void TreeMapText() {
		// it will give sorted order or assending order //
		Map<String, String> map = new TreeMap<String, String>();
		map.put("BHAS012TS", "Bharath"); // entry //
		map.put("KRS7416KA", "Krishna");
		map.put("DAN9505YEL", "DANIYELU");
		map.put("BHAS012TS", "BHARGAVI");
		map.put("MAR9505AM", "THABITHA"); // it allows duplicate names but duplicate ids or pan numbers its not allow //
		map.put("THABITHA", null); // it don't allows null key and it allows null value //
		map.put("krishna", null);
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);

		}

	}

	public void HashTableTest() { // it don't allow null keys and null values
		HashMap<String, Integer> ht = new HashMap<String, Integer>();
		ht.put("krishna", 741);
		ht.put("bhargavi", 9505);
		ht.put("thabitha", 9505);
		ht.put("krishna", 5016);
		for (Entry<String, Integer> entry : ht.entrySet()) {
			System.out.println(entry);

		}

	}

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		// mt.HashMapTest();
		// mt.LinkedMapText();
		// mt.TreeMapText();
		mt.HashTableTest();
	}
}
