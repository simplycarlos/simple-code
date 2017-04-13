package simplycarlos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

/**
 * This class serves to demonstrate the use of Mockito.
 * @author simplycarlos
 *
 */
public class SampleTest {
	
	Sample sample;
	Sample spy;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setup(){
		sample = new Sample();
		
		// Setting a spy on sample in order to mock certain methods.
		spy = Mockito.spy(sample);
	}
	
	/**
	 * Validates whether an exception is thrown from the method being called. The purpose is to demonstrate 
	 * that the when method will call the logic inside the getException method.
	 * @throws Exception
	 */
	@Test
	public void testMockingMethodReturnsException() throws Exception{
		thrown.expect(Exception.class);
		thrown.expectMessage("Inner logic is faulty.");
		
		// Mocked methods
		Mockito.when(spy.getException()).thenReturn(1);
		
		// This code will not be reached
		Assert.assertTrue(1==spy.getInt(spy.getException()));
	}
	
	/**
	 * Validates whether an exception is thrown from getException since the method is called. This demonstrates
	 * the real method of getException is called and not the mocked one.
	 * @throws Exception
	 */
	@Test
	public void testMockingMethodReturnsNestedException() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage("Inner logic is faulty.");
		
		// Mocking method
		Mockito.when(spy.getInt(spy.getException())).thenReturn(1);
	}
	
	/**
	 * Validates whether an int is returned since the getException was mocked.
	 * @throws Exception
	 */
	@Test
	public void testMockingMethodReturnsInt() throws Exception{
		
		// Mocking method
		Mockito.doReturn(1).when(spy).getException();
		
		// Calling real method
		Assert.assertTrue(1==spy.getInt(spy.getException()));
	}
	
}
