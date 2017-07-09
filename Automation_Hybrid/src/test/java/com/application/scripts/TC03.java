package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC03 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description Verify the display of 'YOUR CART' and 'CHECKOUT' buttons in home page
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC03() throws Throwable{
	
		boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
		if (logoflag) {
			SuccessReport("Verify Logo display", "Giggle logo is displayed");
		} else {
			failureReport("Verify Logo display", "Giggle logo is not displayed");	
		}

	}
}
