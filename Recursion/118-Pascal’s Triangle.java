import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result= new ArrayList<>();
        if(numRows==0){
            return result;
        }
        result=generate(numRows-1);
        result.add(sub(numRows));
       return result;
    }

    public  List<Integer> sub(int n){
        List<Integer> subresult1=new ArrayList<>();
        int[][] dp=new int[31][31];
        for(int x=1;x<=n;x++)
            for(int y=1;y<=n;y++)
            {
                if(x==y||y==1)
                    dp[x][y]=1;
                else dp[x][y]=dp[x-1][y-1]+dp[x-1][y];
            }
        if(n==0)
            return subresult1 ;
        for(int i=1;i<=n;i++){
            subresult1.add(dp[n][i]);
        }
        return subresult1;
    }
}