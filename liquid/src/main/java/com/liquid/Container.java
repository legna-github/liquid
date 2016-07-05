package com.liquid;

import java.util.UUID;

public class Container {

	private final String id;
	
	private final int capacity;
	
	private final int usage;
	
	public Container(int capacity, int usage) {
		super();
		this.id = UUID.randomUUID().toString();
		this.capacity = capacity;
		this.usage = usage;
	}


}
