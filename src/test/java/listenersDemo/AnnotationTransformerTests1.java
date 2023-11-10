package listenersDemo;


import org.testng.annotations.Test;

public class AnnotationTransformerTests1 {
	@Test(alwaysRun=true)
	public void test1()
	{
	   System.out.println("This is my first test whose behaviour would get changed while executing");	
	}
	
	@Test
	public void test2()
	{
	   System.out.println("This is my second test executing");	
	}

}
