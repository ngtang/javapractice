package com.factorypattern.upload.validation;

import java.util.ArrayList;
import java.util.List;

import com.factorypattern.upload.attachment.Attachment;

public class PhotoSizeValidator extends SyntacticalCheck {
	@Override
	public List<ValidationResult> validator(ValidationRequest validationRequest) {
		List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
		for (Attachment attachment : validationRequest.getImages()) {
			System.out.println(String.format("The %s is being checked", attachment.getFilename()));
			if (attachment.getSize() > 100) {
				ValidationResult validationResult = new ValidationResult(attachment.getFilename(), false,
						"Size of image is over 100 (M)");
				validationResults.add(validationResult);
			}
			else
			{
				validationRequest.getAttachments().remove(attachment);
			}
		}

		return validationResults;
	}
}
