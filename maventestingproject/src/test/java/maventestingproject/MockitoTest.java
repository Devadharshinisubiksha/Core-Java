package maventestingproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Test;




import org.junit.Test;

public class MockitoTest {


		@Test
		public void test() {
			List<String>mockList=mock(List.class);
			mockList.add("First");
			when(mockList.get(0)).thenReturn("Mockito");
			when(mockList.get(1)).thenReturn("JCG");
			assertEquals("Mockito",mockList.get(0));
			assertEquals("Mockito",mockList.get(0));
			}
	}

		    
	