/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1, h=n,i=1;
        int m=l+(h-l)/2;
        
        while(l<h) {
            m=l+(h-l)/2;
                        
            if(isBadVersion(m)) h=m;
            else l=m+1;
        }
        
        return l;
    }
}