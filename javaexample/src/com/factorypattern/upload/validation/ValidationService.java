package com.factorypattern.upload.validation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationService {

	public static Map<ValidationType, List<Validator>> mapValidator = new HashMap<>(); 
	
	static {
		List<Validator> syntacticalValidators = Arrays.asList(new PhotoValidator(), new ExtensionValidator(), new PhotoSizeValidator());
		mapValidator.put(ValidationType.SYNTACTICAL_CHECK, syntacticalValidators);
		
		List<Validator> semanticalValidators = Arrays.asList(new ContentValidator());
		mapValidator.put(ValidationType.SEMANTICAL_CHECK, semanticalValidators);
	}
	
}
