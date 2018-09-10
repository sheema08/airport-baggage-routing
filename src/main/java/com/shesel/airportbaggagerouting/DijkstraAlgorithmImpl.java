package main.java.com.shesel.airportbaggagerouting;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import main.java.com.shesel.airportbaggagerouting.model.DijkstraGraphMap;
import main.java.com.shesel.airportbaggagerouting.model.DirectedEdge;
import main.java.com.shesel.airportbaggagerouting.model.Vertex;

/**
 * Created by sheema on 9/4/2018.
 */
public class DijkstraAlgorithmImpl implements DijkstraAlgorithm {

	Map<String, DijkstraGraphMap> visitedMap = new ConcurrentHashMap<>(); // Visited
																			// map
																			// with
																			// the
																			// sourceName
																			// as
																			// the
																			// key

	@Override
	public String findShortestPath(String entryGate, String destGate, List<DirectedEdge> edges) {
		DijkstraGraphMap dijkstraGraphMap;
		if (visitedMap.containsKey(entryGate)) {
			dijkstraGraphMap = visitedMap.get(entryGate);
		} else {
			dijkstraGraphMap = new DijkstraGraphMap(edges);
			dijkstraGraphMap.dijkstra(entryGate);
			visitedMap.put(entryGate, dijkstraGraphMap);
		}

		List<Vertex> shortestPath = dijkstraGraphMap.getShortestPath(destGate);
		return generatePathLine(shortestPath);
	}

	private String generatePathLine(List<Vertex> path) {
		StringBuffer line = new StringBuffer();

		for (Vertex vertex : path) {
			line.append(vertex.getName()).append(Constants.SINGLE_WHITE_SPACE);
		}
		line.append(": ").append(path.get(path.size() - 1).getTime());
		return line.toString();
	}

}
