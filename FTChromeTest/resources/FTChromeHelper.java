// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>FTChrome</b><br>
 * Generated     : <b>2020/04/30 2:48:09 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  April 30, 2020
 * @author pandi.v
 */
public abstract class FTChromeHelper extends RationalTestScript
{
	/**
	 * Search: with default state.
	 *		.id : 
	 * 		.type : text
	 * 		.class : Html.INPUT.text
	 * 		.title : Search
	 * 		.name : q
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_search() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_search"));
	}
	/**
	 * Search: with specific test context and state.
	 *		.id : 
	 * 		.type : text
	 * 		.class : Html.INPUT.text
	 * 		.title : Search
	 * 		.name : q
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_search(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_search"), anchor, flags);
	}
	
	

	protected FTChromeHelper()
	{
		setScriptName("FTChrome");
	}
	
}

