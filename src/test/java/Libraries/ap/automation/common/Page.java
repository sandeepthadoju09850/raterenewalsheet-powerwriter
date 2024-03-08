package Libraries.ap.automation.common;

public abstract class Page extends CommonPage{
	public CommonTestMethods commonTestMethods;
	
	public void setSeHelper(SeHelper se){
		super.setSeHelper(se);
		this.se = se;
		this.commonTestMethods = new CommonTestMethods(se);
	}
	
	public void setSeHelper(SeHelper se, boolean flag){
		this.se = se;
		this.commonTestMethods = new CommonTestMethods(se);
	}
	
}




	
