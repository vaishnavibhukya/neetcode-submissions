class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);
        }

        while(min<max){
            int mid=(min+max)/2;
            if(canInFinish(piles , h ,mid )){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }

    public boolean canInFinish(int[] piles , int h , int speed){
        int hours=0;

        for(int pile:piles){
            hours += (int)Math.ceil((double)pile/speed);
        }
        if(hours > h){
            return false;
        }

        return hours<=h;
    }
}
