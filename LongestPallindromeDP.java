int n =s.length();
        
        boolean dp[][] = new boolean[n][n];
        
        //int max = 0;
        //int start=0,end=0;
        String str = "";
        for(int gap=0;gap<n;gap++)
        {
            for(int i=0,j=gap;j<n;j++)
            {
                if(gap == 0)
                {
                    dp[i][j]=true;
                }
                else if(gap == 1)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                else{
                    if((s.charAt(i) == s.charAt(j)) && (dp[i+1][j-1] == true))
                    {
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j])
                {
                    str = s.substring(i,j+1);
                }
            }
        }
        return str;
