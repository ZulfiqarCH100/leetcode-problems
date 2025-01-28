class Solution {
    public String reverseWords(String s) {
        List<String> split = List.of(s.split("[ ]{1,}"));
        StringBuilder ans = new StringBuilder();
        for (int i = split.size() - 1; i >= 0 ; i--){
            ans.append(split.get(i) + ' ');
        }
        return ans.toString().trim();
    }
}