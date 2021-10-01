package com.factorypattern.upload.validation;

import java.util.ArrayList;
import java.util.List;

import com.factorypattern.upload.attachment.Attachment;
import com.factorypattern.upload.attachment.Document;

public class PhotoValidator extends SyntacticalCheck {

	@Override
	public List<ValidationResult> validator(ValidationRequest validationRequest) {
		List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
		for(Attachment attachment: validationRequest.getAttachments()) {
			
			System.out.println(String.format("The %s is being checked",attachment.getFilename()));
			
			if(attachment instanceof Document) {
				ValidationResult validationResult = new ValidationResult(attachment.getFilename(), false, "The attachment is not image");
				validationResults.add(validationResult);
			}else {
				validationRequest.getImages().add(attachment);
			}
			
		}
		
		return validationResults;
	}

}
