class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      
      HashMap<String, Integer> map = new HashMap<>();
      
      for(int i = 0; i<list1.length; i++)
      {
        map.put(list1[i],i);
      }
      
      int min = Integer.MAX_VALUE;
      int lenOfString = 0;
      for(int j = 0; j<list2.length; j++)
      {
        Integer ind = map.get(list2[j]);
        
        if(ind != null)
        {
          int sum = ind + j;
          if(sum < min)
          {
            min = sum;
            list1[0] = list2[j];
            lenOfString = 1;

          }
          else if(sum == min)
          {
            list1[lenOfString++] = list2[j]; 
          }
        }
      }
      String []result = new String[lenOfString];
      for(int i = 0; i<lenOfString; i++)
        result[i] = list1[i];
      return result;
        
    }
}