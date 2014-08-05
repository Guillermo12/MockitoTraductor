import static org.junit.Assert.*;
/*import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;*/
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;


public class GreetingTest {
	
	 private ITranslator mockTranslator;
	 Greeting greeting;
	
	@Before
	public void init(){
		mockTranslator= mock(ITranslator.class);
		greeting = new Greeting(mockTranslator);
		stub(mockTranslator.translate("English", "Italian", "Hello")).toReturn("Ciau");
	}
	
	@Test
	public void testeo(){
		assertEquals("Ciau Paul", greeting.sayHello("Italian", "Paul"));
        //verify
        verify(mockTranslator).translate("English", "Italian", "Hello");
	}

}



