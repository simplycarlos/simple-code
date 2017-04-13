package simplycarlos;

/**
 * This class serves to demonstrate the use of Mockito.
 * @author simplycarlos
 *
 */
public class Sample {
	
	/**
	 * Returns an exception when called. However, if mocked, returns an int.
	 * @return
	 * @throws Exception
	 */
	public int getException() throws Exception{
		throw new Exception("Inner logic is faulty.");
	}
	
	/**
	 * Returns the int being passed as a parameter.
	 * @param i
	 * @return
	 */
	public int getInt(int i){
		return i;
	}
}
