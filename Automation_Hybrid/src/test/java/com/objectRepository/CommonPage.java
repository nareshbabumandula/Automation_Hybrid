package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class CommonPage extends ActionEngine{

	public  By imgGiggleLogo = 	By.id("giggle-logo");
	public 	By txtSearchbox = 	By.id("searchTerm");
	public 	By btnSearch 	= 	By.xpath("//input[@type='submit']");
	public	By lnkSignIN	= 	By.linkText("SIGN IN");
}
