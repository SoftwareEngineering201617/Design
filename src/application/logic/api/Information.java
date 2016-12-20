package application.logic.api;
public interface Information {
	
	String name();
	
	default String getFunctionName() {
		return this.name();
	}
	
}
