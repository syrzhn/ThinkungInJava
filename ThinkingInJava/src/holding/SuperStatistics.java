package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SuperStatistics {
	public static Map<Integer, Integer> getTest() {
		Random rand = new Random();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
		return m;
	}

	public static Integer[] getMax(Map<Integer, Integer> map) {
		int max_key = 0, max_value = 0;
		for (Integer i : map.keySet()) {
			int m = map.get(i);
			if (m > max_value) {
				max_key = i;
				max_value = m;
			}
		}
		Integer[] retInt = {max_key, max_value}; 
		return retInt;
	}
	
	public static void main(String[] args){
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			Integer map[] = getMax(getTest());
			maps.put(map[0], map[1]);
		}
		System.out.println(maps);
		Integer[] max = getMax(maps);
		System.out.println("max: " + max[0] + "~" +max[1]);
	}
}
