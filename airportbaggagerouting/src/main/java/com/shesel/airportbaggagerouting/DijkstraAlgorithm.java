package com.shesel.airportbaggagerouting;

import com.shesel.airportbaggagerouting.model.DirectedEdge;

import java.util.List;

/**
 * Created by sheema on 9/4/2018.
 */
public interface DijkstraAlgorithm {
	public String findShortestPath(String entry, String dest, List<DirectedEdge> graphEdges);
}
