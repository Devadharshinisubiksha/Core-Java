package com.mav.MavenProject;

import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import maventestingproject.MyAssertNotSameTest;

public class MyAssertSameTest {

		public String getPropValue(final String key) {
			Map<String,String>appProps=new HashMap<String,String>();
			appProps.put("key1", "value 1");
			appProps.put("key2", "value1");
			appProps.put("key3", "value3");
			return appProps.get(key);
			
			}@Test
		public void isSameReferenceTest() {
				MyAssertSameTest mst=new MyAssertSameTest();
				
				//assertNotSame(msnt.getPropValue("key1"),msnt.getPropValue("key2"));
				assertSame(mst.getPropValue("key1"),mst.getPropValue("key2"));
			}
		

	}


