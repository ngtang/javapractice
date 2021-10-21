package com.myjava.factorypattern.upload.validation;

public abstract class SemanticalCheck implements Validator{

	@Override
	public ValidationType getValidationType() {
		return ValidationType.SEMANTICAL_CHECK;
	}
}
