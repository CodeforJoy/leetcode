class Solution {
    public int fib(int N) {
        HashMap<Integer,Integer> cache=new HashMap<>();
        int result;
        if(cache.containsKey(N))
            return cache.get(N);
        if(N<2)
            result=N;
        else result=fib(N-1)+fib(N-2);
        cache.put(N,result);
        return result;
    }
}