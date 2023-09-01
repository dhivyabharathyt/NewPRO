package TestPK;
import org.testng.Assert;
import org.testng.annotations.Test;
import mainPK.dev;
public class AppTest {
	
		

		@Test
		public void testlogin1()
		{
			dev myapp=new dev();
			Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
			
		}
		
		@Test
		public void testlogin2()
		{
			dev myapp=new dev();
			Assert.assertEquals(1,myapp.userLogin("abc", "abc@123"));
			
		}}





