package application.gui;

import application.logic.api.Visitor;

public interface Controller extends Visitor {


	
	/**
	 * @clientNavigability NAVIGABLE
	 */
	@Deprecated
	public View lnkView = null;
}
