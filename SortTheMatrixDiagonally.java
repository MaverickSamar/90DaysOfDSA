class Solution {
    
    public void countSort(int[][] mat, int r, int c)
    {
        int n = mat.length;
        int m = mat[0].length;
        
        int arr[] = new int[101];        
        int i=r;
        int j=c;
        
        while(i<n && j<m)
        {
            arr[mat[i][j]]++;
            i++;
            j++;
        }
        
        i=r;
        j=c;
        for(int k=1;k<arr.length;k++)
        {
            while(arr[k]>0)
            {
                mat[i][j] = k;
                i++;
                j++;
                arr[k]--;
            }
        }
    }
    public int[][] diagonalSort(int[][] mat) 
    {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++)
        {
            countSort(mat, i, 0);
        }
        
        for(int i=1;i<m;i++)
        {
            countSort(mat, 0, i);
        }

        return mat;
        
        
    }
}
