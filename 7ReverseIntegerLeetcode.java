class Solution {
    public int reverse(int x) {
        int factor = (x<0)?-1:1;
        
        int result = 0;
        
        int newresult = 0;
        
        while(x!=0){
            int tail = x%10;
            newresult = (result*10) + tail;
            if((newresult-tail)/10 != result ){
                return 0;
            }
            
            result = newresult;
            x = x/10;
        }
        return result;
    }
}