package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        // Demonstrating the use of HashMap in Java
        // HashMap is a part of Java's collection framework and is used to store key-value pairs.
        // It allows null values and the keys can be null as well. 
        // HashMap is not synchronized, meaning it is not thread-safe.
        // It is implemented as a hash table, which means it uses a hash function to compute the index
        // for storing the key-value pairs. This allows for fast retrieval of values based on keys
        // but does not guarantee the order of the elements.

		HashMap<String, Integer> hashmap = new HashMap<>();
		//map<keyType, valueType>
		
		hashmap.put("a", 10);
		hashmap.put("b", 20);
		hashmap.put("c", 30);
		
		System.out.println("Size of hashmap: " + hashmap.size());
		System.out.println(hashmap);
		
		if(hashmap.containsKey("a")) {
			Integer a = hashmap.get("a");
			System.out.println("Value of key" + "\"a\" is :- " + a);
		}
		
		for(String key : hashmap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashmap.get(key));
		}
		
		// if you already know keyset and valueset,just to iterate or print use entryset()
		for(Entry<String, Integer> entry : hashmap.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
}