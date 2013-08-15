package org.fitnesse.plugins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author suselm
 * This class executes commands by delegating to OS shell
 *
 */
public class CommandExecutor {
	/**
	 * Execute command without any validation
	 * @param command
	 * @throws RuntimeException
	 */
	public static void exec(String command) {
		try {
			Process exec = Runtime.getRuntime().exec(command);
			BufferedReader stdInput = new BufferedReader(new 
	             InputStreamReader(exec.getInputStream()));

	        BufferedReader stdError = new BufferedReader(new 
	             InputStreamReader(exec.getErrorStream()));
	        
	        // read the output from the command
	        String s = null;
	        while ((s = stdInput.readLine()) != null) {
	        	System.out.println(command + " : " + s);
	        }

	        // read any errors from the attempted command
	        while ((s = stdError.readLine()) != null) {
	        	System.err.println(command + " : " + s);
	        }

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}