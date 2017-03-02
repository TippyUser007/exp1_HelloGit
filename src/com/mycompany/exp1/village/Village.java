/**
 * 
 */
package com.mycompany.exp1.village;

import com.mycompany.exp1.village.HasVillagers;

/**
 * @author Miles
 *
 */
public class Village implements HasVillagers, GrowingVillage 
{
	private int numberOfVillagers;
	
	public Village(int numberOfVillagers)
	{
		this.numberOfVillagers = numberOfVillagers;
	}
	
	public int countOfVillagers()
	{
		// TODO Auto-generated method stub
		return numberOfVillagers;
	}

	@Override
	public int addVillagers(int addedVillagers) 
	{
		numberOfVillagers += addedVillagers;
		return numberOfVillagers;
	}
	
}
