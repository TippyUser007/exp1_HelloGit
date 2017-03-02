/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Miles
 *
 */
public class Smaug extends Mushu 
{
	private Village villageToEat;
	
	public Smaug(Village villageToEat)
	{
		this.villageToEat = villageToEat;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.exp1.Dragon#eatVillagers(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillagers(Village village) 
	{
		return true;
	}
}
