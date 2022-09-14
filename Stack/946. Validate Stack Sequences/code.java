class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        Stack<Integer> st = new Stack<>();
        
        
  // we need to traverse overall element for both array
        while(i < pushed.length || j < popped.length){
             
         // If pointer is on last element of pushed array 
         // and topmost element of stack is not equal to popped array at j index.
            if(i == pushed.length && st.peek() != popped[j])
                return false;
            
     // this code: check that peek element of stack equals to popped array at j index
     //        if yes then pop the stack element.
     //  for popping element stack should not be empty &Loop should not run beyond popped array 
            while(j < popped.length && !st.isEmpty() && st.peek() == popped[j])
            {
                st.pop();
                j++;
            }
        // push the element in stack until unless we find stack peek element equals to 
            popped array at j;
            while(i < pushed.length){
                st.push(pushed[i]);
                i++;
                if(st.peek() == popped[j])
                    break;
            }
        }
        // if stack is empty then return true or else false;
        return st.isEmpty();
        
    }
}