package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC01 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC01() throws Throwable{
	
		boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
		if (logoflag) {
			SuccessReport("Verify Logo display", "Giggle logo is displayed");
		} else {
			failureReport("Verify Logo display", "Giggle logo is not displayed");	
		}
		
		String strText = getText(lnkSignIN, "SIGN IN");
		if (strText.contains("SIGN IN")) {
			SuccessReport("Verify Text", "Text displayed as :" + strText);
		} else {
			failureReport("Verify Text", "Expected text is not displayed :" + strText);
		}
				
	}
}
