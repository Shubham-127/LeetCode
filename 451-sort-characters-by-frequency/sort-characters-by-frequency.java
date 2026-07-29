class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return map.get(b) - map.get(a);
            }
        });

        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            int count = map.get(ch);
            while (count-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}