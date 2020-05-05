
import resources.FTChromeHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author pandi.v
 */
public class FTChrome extends FTChromeHelper
{
	/**
	 * Script Name   : <b>FTChrome</b>
	 * Generated     : <b>Apr 30, 2020 2:47:27 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2020/04/30
	 * @author pandi.v
	 */
	public void testMain(Object[] args) 
	{
		startApp("www.google.com");
		
		// /HTML Browser
		// Document: Google: https://www.google.com/?gws_rd=ssl
		text_search().setText("Entered from FT test");
	}
}

