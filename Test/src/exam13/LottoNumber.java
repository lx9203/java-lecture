package exam13;

import java.util.*;

public class LottoNumber {

	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
	}

	static int[] getLottoNumber() {
		ArrayList SelectedNumbers6 = new ArrayList();
        ArrayList Balls = new ArrayList(); 
        
  
        for(int i=1; i<=45; i++)
        {
            Balls.add(i);
        }
    
        for(int i = 0; i<6 ;i++)
        {
            int selected_index = (int)Math.floor(Math.random()*(45-i)); 
            SelectedNumbers6.add(Balls.get(selected_index));
            Balls.remove(selected_index);
        }
  
        String PrintResult = "";
        
        for(int i = 0; i<6 ;i++)
        {
            PrintResult += SelectedNumbers6.get(i); 
            if(i != 5) PrintResult +=". ";
        }
        System.out.println(PrintResult);
		return null;

	}

}
