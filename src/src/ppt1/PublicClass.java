package src.ppt1;

public class PublicClass {
	public int publicInt;
	protected int protectedInt;
	int defaultInt;
	private int privateInt;

	public PublicClass() {}
	protected PublicClass(int value) {}
	PublicClass(String value){}
	private PublicClass(int value, int value2) {}

	public void publicFn() {}
	protected void protectedFn() {}
	void defaultFn() {}
	private void privateFn() {}
}

class DefaultClass{

}