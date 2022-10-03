/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int low = 1;
            int high = n;
            
            int mid = 0;
            
            while(low<high){
                //calculate mid
                
                mid = low + (high - low) / 2;
                //if low == mid thisn return low or mid
                if(isBadVersion(mid)){
                    high = mid;
                }else{
                    low = mid+1;
            }
            }
            return low;
        }
    }