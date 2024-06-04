package com.design.pattern;

//Instances of Item will be the Flyweights
class Item {
	private final String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}
}