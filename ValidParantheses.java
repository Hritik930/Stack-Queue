public class Solution{
  public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch == '(' || ch == '{' || ch == '['){
        stack.push(ch);
      }else{
        if(stack.isEmpty){
          return false;
        }
        if((ch == ')' && stack.pop() != '(') ||
           (ch == '}' && stack.pop() != '{') ||
           (ch == ']' && stack.pop() != '[') ){
             return false;
        }
      }
    }
    return stack.isEmpty();
  }
}

=== Method 3 ====

  public class Solution{
  public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
      for(int ch : s.toCharArray()){
      if(ch == '(' || ch == '{' || ch == '['){
        stack.push(ch);
      }else{
        if(stack.isEmpty){
          return false;
        }
        char top = stack.pop();
        if((ch == ')' && top != '(') ||
           (ch == '}' && top != '{') ||
           (ch == ']' && top != '[') ){
             return false;
        }
      }
    }
    return stack.isEmpty();
  }
}

  ==== method 2 ====
    
public class Solution{
  public boolean isValid(String s){
    Map<Character, Character> map = Map.of('(',')','{','}','[',']');
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(map.containsKey(ch)){
          stack.push(map.get(ch));
      }else{
          if(stack.isEmpty() || stack.pop() != ch) return false;
      }
    }
    return stack.isEmpty();
  }
}
