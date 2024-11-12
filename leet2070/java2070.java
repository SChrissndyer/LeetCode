class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // take the items and sort them from item one and two and check the price if their not the same price and then
        // and then checks the beauty and make them sorted in decending order.
        Arrays.sort(items, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int currMaxBeauty = 0;
        // added a map for each price point with its max beauty for each price
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int[] item : items) {
            if (item[1] <= currMaxBeauty) {
                continue;
            }
            currMaxBeauty = item[1];
            m.put(item[0], currMaxBeauty);
        }
        // finds the largest beauty for each price point and default is 0
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Map.Entry<Integer, Integer> entry = m.floorEntry(queries[i]);
            if (entry != null) {
                res[i] = entry.getValue();
            }
        }
        return res;
    }
}