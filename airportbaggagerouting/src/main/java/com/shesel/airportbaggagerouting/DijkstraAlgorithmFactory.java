package com.shesel.airportbaggagerouting;

/**
 * Created by sheema on 9/4/2018.
 */
public class DijkstraAlgorithmFactory {

	public static DijkstraAlgorithm createDijkstraAlgorithm() {
		return new DijkstraAlgorithmImpl();
	}
}
