package maventestingproject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class LifecycleDemoTest {
	@Before
	static void beforeAll() {
		System.out.println("Connect to the database");
		}
	@Before
 void beforeEach() {
 System.out.println("Load the schema");
 }
 @After
 void afterEach() {
 System.out.println("Drop the schema");
 }
 @After
 static void afterAll() {
 System.out.println("Disconnect from the database");
 }
 @Test
 void testOne() {
 System.out.println("Test One");
 }
 @Test
 void testTwo() {
 System.out.println("Test Two");
 } }