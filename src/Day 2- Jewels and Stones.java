class Solution {
    public int numJewelsInStones(String J, String S) {
        
        HashMap<Character, Integer> m= new HashMap<>();
        int c=0;
        
        for(char x: J.toCharArray()) {
            m.put(x,1);
        }
        
        for(char x: S.toCharArray()) {
            if(m.containsKey(x)) c++;
        }
        
        return c;
    }
}