
package application.logic.api;

public interface Subject {


	/**
	* @link aggregation
	*/
	@Deprecated
	public Visitor lnkVisitor = null;
	
	public void attach (Visitor visitor);
	
	public void detach (Visitor visitor);

}
