package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountWords {
	
	public HashMap<String, Integer> countWordsWithHashmap(String str) {
		
		String[] arr = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int temp = map.get(arr[i]) + 1;
				map.put(arr[i], temp);
			} 
			map.putIfAbsent(arr[i], 1);
		}
		System.out.println(map);
		return map;
	}
	
	@SuppressWarnings("rawtypes")
	public void iterateHashMap() {
		HashMap<String, Integer> map = countWordsWithHashmap("This this is is done by Jimmy Jimmy");
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry);
		}
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
	
	public static void main(String[] args) {
		CountWords demo1 = new CountWords();
		//String str = "This this is is done by Jimmy Jimmy";
		demo1.iterateHashMap();
	}
	
}
