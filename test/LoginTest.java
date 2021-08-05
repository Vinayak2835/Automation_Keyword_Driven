package com.keyword.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.keyword.executiveengine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest() throws IOException, InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
		
	}

}
