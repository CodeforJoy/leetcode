class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> cache=new HashMap<>();
        if(cache.containsKey(n))
            return cache.get(n);
        int result;
        result=Fi(n,1,2);
        cache.put(n,result);
        return result;
    }
    public int Fi(int n,int ret1,int ret2){
        if(n==1)
            return ret1;
        else return Fi(n-1,ret2,ret1+ret2);
    }
}