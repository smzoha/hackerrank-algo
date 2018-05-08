package algorithm.graph;

import java.util.*;

/**
 * @author Shamah M Zoha
 * @since 2/21/2018
 */

public class BfsShortReach {

    private static int[] shortestReach(int nodeNum, int[][] edges, int source) {
        Map<Integer, Set<Integer>> adjacencyMap = populateAdjacencyMap(nodeNum, edges);

        return Arrays.stream(bfs(adjacencyMap, source, nodeNum)).boxed()
                .filter(i -> i != 0)
                .mapToInt(i -> i > 0 ? i * 6: i)
                .toArray();
    }

    private static Map<Integer, Set<Integer>> populateAdjacencyMap(int nodeNum, int[][] edges) {
        Map<Integer, Set<Integer>> adjacencyMap = new LinkedHashMap<>();

        for (int nodeIndex = 1; nodeIndex <= nodeNum; nodeIndex++) {
            adjacencyMap.put(nodeIndex, new LinkedHashSet<>());
        }

        for (int[] edge : edges) {
            adjacencyMap.get(edge[0]).add(edge[1]);
            adjacencyMap.get(edge[1]).add(edge[0]);
        }

        return adjacencyMap;
    }

    private static int[] bfs(Map<Integer, Set<Integer>> adjacencyMap, int source, int nodeNum) {
        LinkedList<Integer> nodeQueue = new LinkedList<>();
        boolean[] visited = new boolean[nodeNum];
        int[] levels = new int[nodeNum];

        Arrays.fill(levels, -1);
        nodeQueue.add(source);
        levels[source - 1] = 0;

        while (!nodeQueue.isEmpty()) {
            int contextNode = nodeQueue.removeFirst();
            visited[contextNode - 1] = true;

            for (Integer neighborNode : adjacencyMap.get(contextNode)) {
                if (!visited[neighborNode - 1] && !nodeQueue.contains(neighborNode)) {
                    nodeQueue.addLast(neighborNode);
                    levels[neighborNode - 1] = levels[contextNode - 1] + 1;
                }
            }
        }

        return levels;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] edges = new int[m][2];

            for (int edges_i = 0; edges_i < m; edges_i++) {
                for (int edges_j = 0; edges_j < 2; edges_j++) {
                    edges[edges_i][edges_j] = in.nextInt();
                }
            }

            int s = in.nextInt();
            int[] result = shortestReach(n, edges, s);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }

            System.out.println("");

        }

        in.close();
    }
}