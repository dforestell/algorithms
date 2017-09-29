/* Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

*/

public class FindOdd {
  public static int findIt(int[] A) {
    int odd = 0;
    
    for (int i : A) {
      odd ^= i;
    }
  
    return odd;
  }
}@

FindOdd.findIt(new int[] {1,1,2,-2,5,2,4,4,-1,-2,5});