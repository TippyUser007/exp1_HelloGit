/**
 * 
 */
package com.mycompany.exp1;

import com.mycompany.exp1.dragon.Dragon;
import com.mycompany.exp1.dragon.Mushu;
import com.mycompany.exp1.dragon.Smaug;
import com.mycompany.exp1.village.Village;

/**
 * @author Miles
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Dragon dragonMushu = new Mushu();
		
		Village villageToEat = new Village(10);
		Dragon DragonSmaug = new Smaug(villageToEat);
	}

}
