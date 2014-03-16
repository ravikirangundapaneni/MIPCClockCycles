/**
 * 
 */
package regex_search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ravigundapaneni
 *
 */
public class MIPSClockCycle {

	/**
	 * @param args
	 */
	RegexRules regex = new RegexRules();

	
	public static void main(String[] args) {
		int r = -1;
		
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
			
			String currentDir = System.getProperty("user.dir");
			
			br = new BufferedReader(new FileReader(currentDir.concat( "/Test.txt")));
 
			while ((sCurrentLine = br.readLine()) != null) {
				RegexRules regexR = new RegexRules();
				r = regexR.SearchForRegex(sCurrentLine);
				
				if(r != -1)
				{
					System.out.println(sCurrentLine);
					for(int i=0;i<r;i++)
					{
						
						System.out.println("stall ------------------------");
					}
				}
				else
				{
					System.out.print(sCurrentLine);
					System.out.println("  *****************ERROR*****************");
				}
		       
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
		
	}

}
