class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Step 2: Put all unique numbers into ArrayList
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort according to frequency
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}