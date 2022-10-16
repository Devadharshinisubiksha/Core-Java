package maventestingproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.nio.channels.NetworkChannel;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
@RunWith(JUnit4.class)




	public class ApplicationTest
	{
		@InjectMocks
		MainClass mainClass;

		@Mock
		DatabaseDAO dependentClassOne;

		@Mock
		NetworkChannel dependentClassTwo;

		@Before
		public void init() {
			MockitoAnnotations.initMocks(this);
		}
		@Test
		public void validateTest() {
			when(dependentClassOne.save("sdfffg")).thenReturn(true);
			when(((MainClass) dependentClassTwo).save("sdfffg")).thenReturn(true);
			boolean saved=mainClass.save("D://test.txt");
			assertEquals(true,saved);
		}
		}
		
		
		
		
		
		
		



