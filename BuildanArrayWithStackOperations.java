import java.util.ArrayList;
import java.util.List;

Public Solution{
  public List<String> buildArray(int[] target, int n){
    List<String> op = new ArrayList<>();
    for(int t : target){
    int curr = 1;
      while(curr<t){
        op.add("Push");
        op.add("pop");
        curr++;
      }
      op.add("push");
      curr++;
    }
    return op;
  }
}
