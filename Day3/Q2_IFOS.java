package Day3;

class Q2_IFOS {
    public int strStr(String haystack, String needle) {
        if((haystack.length()==needle.length()) && haystack.equals(needle)){
            return 0;
        }
        int l1 = needle.length();
        int l2 = haystack.length();
        for(int i = 0;i<=l2-l1;i++){
            String x = haystack.substring(i,i + l1);
            if(x.equals(needle)){
                return i;
            }
        }
        return -1;
    }

}