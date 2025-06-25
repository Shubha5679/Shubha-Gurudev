//Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9].

import java.util.*;
public class CountOfMultiples
{
	public static void main(String[] args)
	{
		int[]  list = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
		
		Map<Integer, Integer>  count = new HashMap<>();
		
		for(int i=1; i<=9; i++)
		{
			count.put(i, 0);
		}

		for(int key=1; key<=9; key++)
		{
		    for(int num : list)
		    {
    			if(num % key ==0)
    			{
    				count.put(key, count.get(key) + 1);
    			}
		    }
			
		}
		System.out.println(count);
	}
}
