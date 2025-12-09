class Solution {
    // one of the solution bit TLE
    // public boolean checkInclusion(String s1, String s2){
    //     String s="";
    //     if(s1.length()==2) {
    //         s=s1.charAt(1)+""+s1.charAt(0);
    //         if(s2.contains(s1) || s2.contains(s)) return true;
    //     }
    //     else if(s1.length()==1){
    //         if(s2.contains(s1)) return true;
    //     }
    //     else{
    //         HashSet<String> set=new HashSet<>();
    //         perm(s1,"",set);
    //         for(String ele:set){
    //             if(s2.contains(ele)) return true;
    //         }
            
    //     }
    //     return false;
    // }
    // public void perm(String s1,String p, HashSet<String> set){
    //     if(s1.length()==0){
    //         set.add(p);
    //         return ;
    //     }
    //     char ch=s1.charAt(0);
    //     for(int i=0;i<=p.length();i++){

    //         String f=p.substring(0,i);
    //         String l=p.substring(i);

    //         perm(s1.substring(1),f+ch+l,set);
    //     }
    // }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }
        
        for (int i = 0; i < n1; i++) {
            count2[s2.charAt(i) - 'a']++;
        }
        
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (count1[i] == count2[i]) matches++;
        }
        
        if (matches == 26) return true;
        
        for (int i = n1; i < n2; i++) {
            char outChar = s2.charAt(i - n1);
            char inChar = s2.charAt(i);
            int outIdx = outChar - 'a';
            int inIdx = inChar - 'a';
            
            if (count2[outIdx] == count1[outIdx]) matches--;
            count2[outIdx]--;
            if (count2[outIdx] == count1[outIdx]) matches++;
            if (count2[inIdx] == count1[inIdx]) matches--;
            count2[inIdx]++;
            if (count2[inIdx] == count1[inIdx]) matches++;
            
            if (matches == 26) return true;
        }
        
        return false;
    }



}
