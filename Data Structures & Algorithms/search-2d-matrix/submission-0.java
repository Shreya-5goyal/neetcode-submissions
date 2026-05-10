class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int m=matrix.length;
     int n=matrix[0].length;

        int l=0;
        int r=m-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(matrix[mid][0]<=target&&matrix[mid][n-1]>=target)
            {
                   int k=0;
                   int g=n-1;
                   while(k<=g)
                   {
                    int s=(k+g)/2;
                     if(matrix[mid][s]==target)
                      return true;
                      else if(matrix[mid][s]>target)
                      {
                           g=s-1;
                      }
                      else {
                        k=s+1;
                      }
                   }
                   return false;
            }
            else if(matrix[mid][0]<target)
            {
                l=mid+1;
            }
            else  r=mid-1;
        }

        return false;
    }
}
