package com.factorypattern.upload.validation;

public abstract class SyntacticalCheck implements Validator{

	@Override
	public ValidationType getValidationType() {
		return ValidationType.SYNTACTICAL_CHECK;
	}
}
