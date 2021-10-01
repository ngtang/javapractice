package com.factorypattern.upload.validation;

import java.util.ArrayList;
import java.util.List;

import com.factorypattern.upload.attachment.Attachment;

public class ExtensionValidator extends SyntacticalCheck {
	@Override
	public List<ValidationResult> validator(ValidationRequest validationRequest) {
		List<ValidationResult> validationResults = new ArrayList<ValidationResult>();
		for (Attachment attachment : validationRequest.getImages()) {

			System.out.println(String.format("The %s is being checked", attachment.getFilename()));
			
			int index = attachment.getFilename().lastIndexOf(".") + 1;
			String extension = attachment.getFilename().substring(index);
			
			if (!extension.equalsIgnoreCase("PNG") && !extension.equalsIgnoreCase("JPG")
					&& !extension.equalsIgnoreCase("JPEG")) {
				ValidationResult validationResult = new ValidationResult(attachment.getFilename(), false,
						"The type of image is incorrect:" + extension);
				validationResults.add(validationResult);
			}else {
				validationRequest.getAttachments().remove(attachment);
			}

		}

		return validationResults;
	}
}
