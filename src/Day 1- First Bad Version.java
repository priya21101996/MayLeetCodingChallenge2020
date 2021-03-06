class Solution {
    public int firstUniqChar(String s) {
                
        if(s==null) return -1;
        
        
        HashMap<Character, Integer> m = new HashMap<>();
        
        for(char x: s.toCharArray()) {
            m.put(x, m.getOrDefault(x, 0)+1);
        }
        
        for(int i=0; i<s.length(); i++) {
            char x= s.charAt(i);
            if(m.get(x)==1) return i;            
        }
        
        return -1;
    }
}