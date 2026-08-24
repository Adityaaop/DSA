class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        for(String word : words) {
            m.put(word, m.getOrDefault(word, 0) + 1);
        }  
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (m.get(b) == m.get(a) ? a.compareTo(b) : m.get(b) - m.get(a)));
        for(String key : m.keySet()) {
            pq.add(key);
        }
        while(k > 0) {
            ans.add(pq.remove());
            k--;
        }
        return ans;
    }
}
