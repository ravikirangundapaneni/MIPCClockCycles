/**
 * 
 */
package regex_search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ravigundapaneni
 *
 */
public class RegexRules 
{
	
	
	String[] regexArray = {"(SD.*?)|(SUBI.*?)","(LD.*?)|(BNEZ.*?)|(BEZ.*?)|(BRA.*?)","(ADD.*?)|(ADDI.*?)|(SUB.*?)|(SUBI.*?)|(ADD.D.*?)|(SUB.D.*?)|(MUL.D.*?)|(DIV.D.*?)"};
	
	public int SearchForRegex(String currentString)
	{
		int result = -1;
		
		
		for(int i=0;i<regexArray.length;i++)
		{
			Pattern p0 = Pattern.compile(regexArray[i]);
			 Matcher m0 = p0.matcher(currentString);
			 boolean b0 = m0.matches();
			 if(b0)
			 {
				 result = i;
				 break;
			 }
		}
		
		return result;
	}
}
