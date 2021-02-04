//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    //for loop from 0 to size of arraylist - 1
    for(int i = 0; i<ray.size()-1; i++) {
      //If statement if last element of arraylist is equal to current element of arraylist
      if(ray.get(ray.size()-1) == ray.get(i)) {
        //return true
        return true;
      }
    }
    //return false if for loop executed without returning true
    return false;
	}
}