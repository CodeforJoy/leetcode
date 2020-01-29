class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        boolean T=true;
        int a = 0, b=0,tmp = 0;
        for (int i=0;i<n;i++){
            if(i==0)
                a=nums[0];
            else {
                tmp=a;
                a=Math.max(a,nums[i]+b);
                b=tmp;
            }
        }
        return a;
        
    }
}