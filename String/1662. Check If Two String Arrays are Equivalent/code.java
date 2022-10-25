class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String conWord1 = "";
        String conWord2 = "";
        
        for(String s1 : word1)
            conWord1 += s1;
        
        for(String s2 : word2)
            conWord2 += s2;
        return (conWord1.equals(conWord2));
    }
}