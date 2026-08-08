class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        String min=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min.length()) min=strs[i];
        }
        int minimum=min.length();
        for(int i=0;i<strs.length;i++)
        {
            for(int j=0;j<minimum;j++){
                if(min.charAt(j)!=strs[i].charAt(j))
                {minimum=j;
                break;
                }
            }
        }
        for(int i=0;i<minimum;i++)
        str+=min.charAt(i);
        return str;
    }
}