package com.source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableMain{
	
	
	public static void main(String[] args) {
		
		List<ComputerFeature> l = new ArrayList<ComputerFeature>();
        l.add(new ComputerFeature("Asus", 16, 400000));
        l.add(new ComputerFeature("Sony", 4, 600000));
        l.add(new ComputerFeature("Dell", 8, 50000));
        
        Collections.sort(l);
        
        l.stream().forEach(i -> System.out.println(i));
        
	}
		
    

}
