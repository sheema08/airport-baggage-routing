package com.shesel.airportbaggagerouting.model;

/**
 * Created by sheema on 9/4/2018.
 */
public class Bag {
	private final String id;
	private final String entryGate;
	private final String flight;

	public Bag(String id, String entryGate, String flight) {
		this.id = id;
		this.entryGate = entryGate;
		this.flight = flight;
	}

	public String getId() {
		return id;
	}

	public String getEntryGate() {
		return entryGate;
	}

	public String getFlight() {
		return flight;
	}
}
