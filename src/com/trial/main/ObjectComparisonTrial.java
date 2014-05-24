/**
 * 
 */
package com.trial.main;

import java.util.ArrayList;
import java.util.List;

import com.trial.pojo.User;

/**
 * @author balaji i
 *
 */
public class ObjectComparisonTrial
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		User user = new User("Arvind","Kejriwal");
		
		User obj = new User("Arvind", "Kejriwal");
		
		
		if(user.equals(obj))
			System.out.println("Equality Proved");
		else
			System.out.println("Unequal Objects");
		
		
		
		List<User> users = new ArrayList<User>();
		
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
					users.add(new User("Arvind", "Kejriwal"));
				else
					users.add(new User("Narendra", "Modi"));
				
			}
			for (int i=1;i<=users.size();i++) 
			{
				User user1 = users.get(i);
				
				
				if(i<=8)
				{
					User user2 = users.get(i+1);
					
					
					if(user1.equals(user2))
					System.out.println(" Alternate Objects are equal ");
					
					if(user1.equals(users.get(i+2)))
					System.out.println(" Every Second Object is Equal " +user1.getUsername());
				}
			}
			
	}

}
