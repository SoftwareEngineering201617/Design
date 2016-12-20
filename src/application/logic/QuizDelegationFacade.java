package application.logic;

import java.util.HashSet;
import java.util.Set;

import application.logic.api.Information;
import application.logic.api.Model;
import application.logic.api.Visitor;

public class QuizDelegationFacade implements Model {
	private Set<Visitor> registry = new HashSet<>();
	private Information lastEvent = null;

	@Override
	public void attach(Visitor visitor) {
		registry.add(visitor);
		visitor.update(lastEvent);
	}

	@Override
	public void detach(Visitor visitor) {
		registry.remove(visitor);
	}
	
	
	
}
