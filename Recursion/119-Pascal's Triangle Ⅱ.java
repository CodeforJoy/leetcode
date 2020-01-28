import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> subresult1=new ArrayList<>();
        int[][] dp=new int[35][35];
        for(int x=0;x<=rowIndex;x++)
            for(int y=0;y<=x;y++)
            {
                if(x==y||y==0)
                    dp[x][y]=1;
                else dp[x][y]=dp[x-1][y-1]+dp[x-1][y];
            }
        if(rowIndex==-1)
            return subresult1 ;
        for(int i=0;i<=rowIndex;i++){
            subresult1.add(dp[rowIndex][i]);
        }
        return subresult1;
        
    }
}