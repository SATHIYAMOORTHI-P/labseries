package org.in;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

public class Sample {
public static void main(String[] args) {

	Logger log=Logger.getLogger("initial");

			char c = 'A';
		Map<Integer, Character> m = new HashMap<Integer, Character>();
		for (int i = 1; i <= 26; i++) {
		m.put(i, c);
		c++;
		}
	String s="ARUN";
	log.info("enter the string");
	for (int i = 0; i <s.length(); i++) {
	char cc = s.charAt(i);
	String sv = String.valueOf(cc);
	Set<Entry<Integer, Character>> es = m.entrySet();
	for (Entry<Integer, Character> en : es) {		
	if(sv.contains(en.getValue().toString())) {
		
		
		Integer key = en.getKey();
		System.out.println(key);
	
	}
	}
	}}
}
	

	
	
