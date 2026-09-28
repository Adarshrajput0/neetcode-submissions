class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();

        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if(st.isEmpty() || st.peek() != map.get(ch)){
                    return false;
                }
                st.pop();
            }
            else st.push(ch);
        }
        return st.isEmpty();
    }
}
