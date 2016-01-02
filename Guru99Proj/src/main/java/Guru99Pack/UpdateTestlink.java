package Guru99Pack;


import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class UpdateTestlink {

	public static String DEVKEY="528160a554455fe2b7c3271b1abfb637";
	public static String URL="http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";


	public void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{

 TestLinkAPIClient api = new TestLinkAPIClient(DEVKEY, URL);
	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);

	}
}
