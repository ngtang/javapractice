package com.myjava.factorypattern.upload.validation;

import java.util.ArrayList;
import java.util.List;

import com.myjava.factorypattern.upload.attachment.Attachment;

public class ContentValidator extends SemanticalCheck {

	@Override
	public List<ValidationResult> validator(ValidationRequest validationRequest) {
		List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
		for(Attachment attachment: validationRequest.getImages()) {
			if(attachment.getContent().getBytes().length > 100) {
				ValidationResult validationResult = new ValidationResult(attachment.getFilename(), false, "Size of content is over 100 bytes");
				validationResults.add(validationResult);
			}else {
				validationRequest.getImages().add(attachment);
			}
		}
		
		return validationResults;
	}

}
