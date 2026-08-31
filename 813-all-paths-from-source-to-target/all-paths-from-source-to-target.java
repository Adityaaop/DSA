class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> currPath = new ArrayList<>();
        List<List<Integer>> allPaths = new ArrayList<>();
        dfs(graph, 0, currPath, allPaths);
        return allPaths;
    }
    public void dfs(int[][] graph, int src, List<Integer> currPath, List<List<Integer>> allPaths) {
        if(src == graph.length - 1) {
            currPath.add(src);
            allPaths.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size() - 1);
            return;
        }
        currPath.add(src);
        for(int next : graph[src]) {
            dfs(graph, next, currPath, allPaths);
        }
        currPath.remove(currPath.size() - 1);
    }
}