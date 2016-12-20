package application.logic;

import application.logic.api.Model;

public interface APIFactory {
	

	
	/**
	 * @supplierNavigability NOT_NAVIGABLE
	 */
	
	@Deprecated
	public Model lnkModel = null;

	public Model getModel();
	
	public static APIFactory getFactory() {
		return DefaultAPIFactory.getOrCreateFactory();
	}
	
}
