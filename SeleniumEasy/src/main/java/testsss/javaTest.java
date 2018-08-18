package testsss;

public class javaTest {
   static String[] first={"x","y","p","p","e","ls","h","j","a","s","cc","v","d"};
  static  String[] sec={"p","V","X","B","e","ls","h","LL","s","LL","W","Q"};
  
  public static void main(String[] args) {

      for(int i=0;i<first.length;i++){
          for(int j=0;j<sec.length;j++){
        	//  System.out.println("sec "+sec[j]);
          if(first[i]==(sec[j])) {
              System.out.print(sec[j]);
          continue;
          }
          }
    // System.out.println("frist "+first[i]);
      }

  }

}
