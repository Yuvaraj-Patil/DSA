import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
        System.out.println(largestRectangleArea(new int[]{3,2,4,1,5,2}));
    }


    public static int solve(String A) 
    {
        Stack<Character> st=new Stack<>();
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            if(!st.empty() && A.charAt(i)=='}' && st.peek()=='{')
                st.pop();
            else if(!st.empty() && A.charAt(i)==']' && st.peek()=='[')
                st.pop();
            else if(!st.empty() && A.charAt(i)==')' && st.peek()=='(')
                st.pop();
            else
                st.push(A.charAt(i));
        }        
        return st.empty()?1:0;        
    }

    /*
     * Given an array of integers A.
     * A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.
     * Find the area of the largest rectangle formed by the histogram.
    */
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}