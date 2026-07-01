class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n =s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }

        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        for(int i=0;i<=m-n;i++){

            String str=s2.substring(i,i+n);
            char[] ch2=str.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch1 , ch2)){
                return true;
            }
        }
        return false;
    }
}

