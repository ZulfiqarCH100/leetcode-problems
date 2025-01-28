class Solution {
    public String reverseWords(String s) {
        List<String> split = Arrays.asList(s.split("[ ]{1,}"));
        Collections.reverse(split);
        return split.stream().collect(Collectors.joining(" ")).trim();
    }
}