import java.lang.Math;
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0]; 
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] lyes=new int[n-3];
        int[] lno=new int[n-1];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if (i==0){}
            else if (i==1|i==n-1){
                lno[k]=nums[i];
                k++;
            }
            else {
                lyes[j]=nums[i];
                lno[k]=nums[i];
                j++;
                k++;
            }
        }
        int a = 0, b=0,tmp = 0;
        for (int i=0;i<n-3;i++){
            if(i==0)
                a=lyes[0];
            else {
                tmp=a;
                a=Math.max(a,lyes[i]+b);
                b=tmp;
            }
        }
        int tt1=a;
        a = 0;
        b=0;
        tmp = 0;
        for (int i=0;i<n-1;i++){
            if(i==0)
                a=lno[0];
            else {
                tmp=a;
                a=Math.max(a,lno[i]+b);
                b=tmp;
            }
        }
        int tt2=a;
        return Math.max(tt1+nums[0],tt2);
        
    }
}