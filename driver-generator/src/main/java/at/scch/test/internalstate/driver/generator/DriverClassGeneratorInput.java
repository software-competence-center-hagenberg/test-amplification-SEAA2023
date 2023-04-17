package at.scch.test.internalstate.driver.generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

class DriverClassGeneratorInput {
	
	private Class<?> inputClass;
	
	private List<Constructor<?>> publicConstructors;

	private List<Method> publicMethods;
	
	private List<Method> internalStateMethods;
	
	DriverClassGeneratorInput(Class<?> inputClass) {
		this.inputClass = inputClass;
		
		publicConstructors = new LinkedList<>();
		publicMethods = new LinkedList<>();
		internalStateMethods = new LinkedList<>();
	}
	
	
	List<Method> getPublicMethods() {
		return publicMethods;
	}
	
	List<Method> getInternalStateMethods() {
		return internalStateMethods;
	}


	public Class<?> getInputClass() {
		return inputClass;
	}


	public List<Constructor<?>> getConstructors() {
		return publicConstructors;
	}
	

}
