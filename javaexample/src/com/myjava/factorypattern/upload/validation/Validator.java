package com.myjava.factorypattern.upload.validation;

import java.util.List;

public interface Validator {
	
	ValidationType getValidationType();
	
	List<ValidationResult> validator(ValidationRequest validationRequest);

}
