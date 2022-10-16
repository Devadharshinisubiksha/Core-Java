package maventestingproject;
import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyAssertNotSameTest {
	public String getPropValue(final String key) {
		Map<String,String>appProps=new HashMap<String,String>();
		appProps.put("key1", "value 1");
		appProps.put("key2", "value1");
		appProps.put("key3", "value3");
		return appProps.get(key);
		
		}@Test
	public void isSameReferenceTest() {
			MyAssertNotSameTest msnt=new MyAssertNotSameTest();
			
			//assertNotSame(msnt.getPropValue("key1"),msnt.getPropValue("key2"));
			assertSame(msnt.getPropValue("key1"),msnt.getPropValue("key2"));
		}
	

}
