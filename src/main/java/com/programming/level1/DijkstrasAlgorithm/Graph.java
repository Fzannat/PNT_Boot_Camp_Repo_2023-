package com.programming.level1.DijkstrasAlgorithm;

import java.util.*;

public class Graph{
    private int V;
    private List<List<Node>> adjList;

    // Constructor to initialize the graph with a given number of vertices
    public Graph(int vertices) {
        this.V = vertices;
        this.adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph with a source, destination, and weight
    public void addEdge(int source, int destination, int weight) {
        Node newNode = new Node(destination, weight);
        this.adjList.get(source).add(newNode);
    }

    // Dijkstra's algorithm to find the shortest paths from a start vertex
    public void dijkstra(int startVertex) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        int[] distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);

        // Add the start vertex to the priority queue with distance 0
        priorityQueue.add(new Node(startVertex, 0));
        distances[startVertex] = 0;

        // Process vertices in the priority queue
        while (!priorityQueue.isEmpty()) {
            int currentVertex = priorityQueue.poll().vertex;

            // Update distances for neighboring vertices
            for (Node neighbor : adjList.get(currentVertex)) {
                int newDistance = distances[currentVertex] + neighbor.weight;

                // If a shorter path is found, update the distance and enqueue the neighbor
                if (newDistance < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDistance;
                    priorityQueue.add(new Node(neighbor.vertex, newDistance));
                }
            }
        }

        // Print the shortest distances
        System.out.println("Shortest distances from vertex " + startVertex + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To vertex " + i + ": " + distances[i]);
        }
    }

}
