/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Miles
 *
 */
public class Mushu implements Dragon 
{

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.Dragon#breathsFire()
	 */
	@Override
	public boolean breathsFire() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() 
	{
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.Dragon#eatVillagers(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillagers(Village village) 
	{
		return false;
	}

}
