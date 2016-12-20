
package application.logic.api;

import application.gui.Controller;
import application.gui.View;

public interface Model extends Subject {

	/**
	* @link aggregation
	*/
	@Deprecated
	public Controller lnkController = null;
	/**
	* @link aggregation
	*/
	@Deprecated
	public View lnkView = null;

}
