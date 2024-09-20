/**
 * 2darry
 */
/**
 * darry
 */
public class darry {

  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,6} };
    int search=90;

 
  for (int i = 0; i< myNumbers.length; i++) {
    for (int j = 0; j < myNumbers.length; j++) {
      if(myNumbers[i][j]==search){
      
      System.out.println(true);
      return;
      }
    }
  }
  System.out.println(false);
}
}

  

 
    

