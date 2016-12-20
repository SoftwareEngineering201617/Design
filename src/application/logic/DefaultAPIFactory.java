package application.logic;

import application.logic.api.Model;

public class DefaultAPIFactory implements APIFactory {
	private static APIFactory factory;
	private QuizDelegationFacade model;
	private DefaultAPIFactory() {}

	@Override
	public Model getModel() {
		if (this.model == null) {
			this.model = new QuizDelegationFacade();
		}
		return this.model;
	}
	
	static APIFactory getOrCreateFactory() {
		if (factory == null) {
			factory = new DefaultAPIFactory();
		}
		return factory;
	}
	
}
