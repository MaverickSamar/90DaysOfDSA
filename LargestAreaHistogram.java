import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    Stack<Integer> st = new Stack<>();
   int rb[] = new int[n];
   int lb[] = new int[n];
   
   rb[n-1] = n;
   lb[0] = -1;
   st.push(n-1);
    //System.out.println(st.peek());
    for(int i =n-2;i>=0;i--)
    {
       if(arr[i] <= arr[st.peek()])
       {
           while(st.size()>0 && arr[st.peek()] >= arr[i])
           {
               st.pop();
           }
           if(st.size() == 0)
           {
               rb[i] = n;
           }
           else{
               rb[i] = st.peek();
           }
           st.push(i);
       }
       else
       {
           rb[i] = st.peek();
           st.push(i);
       }
       //System.out.println("Stack = "+ st.peek() + " rb = "+rb[i]);
    }
    while(st.size()>0)
    {
        st.pop();
    }
    st.push(0);
    for(int i=1;i<n;i++)
    {
       if(arr[i] <= arr[st.peek()])
       {
           while(st.size()>0 && arr[st.peek()] >= arr[i])
           {
               st.pop();
           }
           if(st.size() == 0)
           {
               lb[i] = -1;
           }
           else{
               lb[i] = st.peek();
           }
           st.push(i);
       }
       else
       {
           lb[i] = st.peek();
           st.push(i);
       }
       //System.out.println("Stack = "+ st.peek() + " lb = "+lb[i]);
    }
   int max = 0;
   for(int i=0;i<n;i++)
   {
       int val = (rb[i] - lb[i] -1)*arr[i];
       max = Math.max(max, val);
   }
   System.out.println(max);
 }
}
