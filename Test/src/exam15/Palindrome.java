package exam15;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
        Palindrome.isPalindrome();
	}
	
	static boolean isPalindrome(){
        int intValue1;
        String stringValue1;
        ArrayList<String> arraylist = new ArrayList<String>();
       for(int i=1; i<1000; i++){
           for(int j=1; j<1000; j++){
//               System.out.println("i값: "+i+"x"+j+"="+i*j);
               intValue1 = i*j;
               stringValue1 =Integer.toString(intValue1);
               
               if(stringValue1.length() % 2 == 0){
                   if(stringValue1.length() == 2){
                       if(stringValue1.charAt(0) == stringValue1.charAt(1)){
                           System.out.println("2자리 대칭수: "+stringValue1);
                       }
                   }
                   if(stringValue1.length() == 4){ // 10 01
                       if(stringValue1.substring(0,2).equals(stringValue1.substring(3,4)+stringValue1.substring(2,3))){
                           System.out.println("4자리 대칭수: "+stringValue1);
                       }
                   }
                   if(stringValue1.length() == 6){
                       if(stringValue1.substring(0,3).equals(stringValue1.substring(5,6)+stringValue1.substring(4,5)+stringValue1.substring(3,4))){
                           System.out.println("6자리 대칭수: "+stringValue1);
                           arraylist.add(stringValue1);
                       }
                   }
               }
           }
       }        
       System.out.println("3자리 대칭수 중 가장 큰값은: "+Collections.max(arraylist));
	return false;
   }
}
