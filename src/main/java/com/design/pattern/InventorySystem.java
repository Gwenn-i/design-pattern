package com.design.pattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	void read() {
		for (Order order : orders) {
			System.out.println(order.getItem().getName() +" - "+ System.identityHashCode(order.getItem()));
		}
	}
}