class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String sorted = sort(strs[i]);

            if (!mp.containsKey(sorted)) {
                mp.put(sorted, new ArrayList<>());
            }

            mp.get(sorted).add(strs[i]);
        }

        return new ArrayList<>(mp.values());
    }

    public String sort(String s) {

        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }
}