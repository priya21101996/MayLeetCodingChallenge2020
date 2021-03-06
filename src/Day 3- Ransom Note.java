class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> m= new HashMap<>();
        
        for(char x: magazine.toCharArray()) {
            m.put(x, m.getOrDefault(x, 0)+1);
        }
        
        for(char x: ransomNote.toCharArray()) {
            
            if(m.containsKey(x)) {
                if(m.get(x)>1) {
                    m.put(x, m.get(x)-1);
                } else m.remove(x);
                
            }
            else return false;
        }
        
        return true;
    }
}