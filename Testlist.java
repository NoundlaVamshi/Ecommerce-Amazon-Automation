package amazon;
import org.testng.ITestContext;/////// 
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlist implements ITestListener {
	

		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("started your test ");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("your test passed");
		}
		

		}


