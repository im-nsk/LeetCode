class Solution {
  private String morseCode(char c)
  {
    switch(c)
    {
        case 'a': return ".-";
        case 'b': return "-...";
        case 'c': return "-.-.";
        case 'd': return "-..";
        case 'e': return ".";
        case 'f': return "..-.";
        case 'g': return "--.";
        case 'h': return "....";
        case 'i': return "..";
        case 'j': return ".---";
        case 'k': return "-.-";
        case 'l': return ".-..";
        case 'm': return "--";
        case 'n': return "-.";
        case 'o': return "---";
        case 'p': return ".--.";
        case 'q': return "--.-";
        case 'r': return ".-.";
        case 's': return "...";
        case 't': return "-";
        case 'u': return "..-";
        case 'v': return "...-";
        case 'w': return ".--";
        case 'x': return "-..-";
        case 'y': return "-.--";
        case 'z': return "--..";
    }
    return " ";
  }
    public int uniqueMorseRepresentations(String[] words) {
      HashSet<String> set = new HashSet<>();
      for(String s : words)
      {
        String morseCode = "" ;
        for(int i = 0; i < s.length(); i++)
        {
          morseCode += morseCode(s.charAt(i));
        }
        set.add(morseCode);
      }    
      return set.size();
  
    }
}