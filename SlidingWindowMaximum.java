import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    
    Stack<Integer> st = new Stack<>();
    int gr[] = new int[n];
    
    //initializing
    gr[n-1] = n;
    st.push(n-1);
    
    //find next greater
    for(int i=n-2;i>=0;i--)
    {
        while(st.size()>0 && a[i] >= a[st.peek()])
        {
            st.pop();
        }
        if(st.size() == 0)
        {
            gr[i] = n;
        }
        else{
            gr[i] = st.peek();
        }
        st.push(i);
    }
    
    int j=0;
    for(int i=0;i<n-k+1;i++)
    {
        if(j<i)
        {
            j = i;
        }
        while(gr[j] < i+k)
        {
            j = gr[j];
        }
        System.out.println(a[j]);
    }
        
}
    
}









