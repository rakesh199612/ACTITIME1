package actitime;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void demo()
	{
		Reporter.log("hello", true);
		Reporter.log("hello", true);
		Reporter.log("hello", true);
	}
}
