package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Test {
	public static void main(String[] args) {

//server start
		Playwright  playwright =Playwright.create();
		/* LaunchOptions lp=new LaunchOptions();
		 lp.setChannel("chrome");
		 lp.setHeadless(false);*/
	Browser browser=playwright.firefox().launch(new LaunchOptions().setHeadless(false));
BrowserContext context=browser.newContext();
  Page page=    context.newPage();
  page.navigate("https://eventhub.rahulshettyacademy.com/login");
  System.out.println(page.title());
 playwright.close();
	}

	
	

}
