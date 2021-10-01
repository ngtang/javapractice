package com.factorypattern.upload.attachment;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.factorypattern.upload.enumdata.ImageSize;
import com.factorypattern.upload.enumdata.ImageType;
import com.factorypattern.upload.validation.ValidationRequest;
import com.factorypattern.upload.validation.ValidationResult;
import com.factorypattern.upload.validation.ValidationService;
import com.factorypattern.upload.validation.ValidationType;
import com.factorypattern.upload.validation.Validator;

public class AttachmentSet {

	private Set<Attachment> attachments = new TreeSet<Attachment>();

	public Set<Attachment> getAttachments() {
		return attachments;
	}

	public void initial() {
		attachments.addAll(Arrays.asList(new Document("Document.pdf", "document content", 5.8, "Nox"),
				new Image("imagevalid.png", "image content", 7.3, ImageType.HD, ImageSize.MEDIUM),
				new Image("imgplane.jpg", "image content", 145.9, ImageType.RAW, ImageSize.LARGE),
				new Image("imgcar.crash", "image content", 2.5, ImageType.RAW, ImageSize.SMALL),
				new Image("imgcuise.jpg", "i ♥ u lskdjflk lsdjf lsd fklsdlkf lskjf jsldfjls jdflkjslkd fjlksj dflkjs "
						+ "ldkfjlsjd flkjs dlkkfjlskj flksj lfkjsldf jlkjl", 75.8, ImageType.RAW, ImageSize.UNLIMITTED)
				));

	}

	public void print() {
		for (Attachment att : this.attachments) {
			System.out.println("----File information---");
			att.show();
			System.out.print("\n");
		}
	}
	public Attachment findAttachment(String name)
	{
		return null;
	}
	public void saveFaillureResult(List<ValidationResult> validationResults)
	{
		String textToPrint ="{ValidationResult :[\n";
		for(ValidationResult validationResult: validationResults)
		{
			char lastChar = textToPrint.charAt(textToPrint.length()-1);
			if(lastChar=='}') {
				textToPrint+=",\n";
			}
			textToPrint+=String.format("{Filename: “%s”,Valid: “%s”,errorMessage: “%s”}", 
					validationResult.getFileName(),
					validationResult.isValid(),
					validationResult.getErrorMessage());
		}
		textToPrint+="\n]}";
//		System.out.print(textToPrint);
		try (PrintWriter out = new PrintWriter("Validation.txt")) {
		    out.println(textToPrint);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doValidation()
	{
		ValidationRequest validationRequest= new ValidationRequest();
		validationRequest.getAttachments().addAll(attachments);
		List<ValidationResult> validationResults = new ArrayList<>();
		/*
		 * enum.value().for()
		 */
		
		for(ValidationType validationType: ValidationType.values())
		{
			List<Validator> validators = ValidationService.mapValidator.get(validationType);
			for(Validator val: validators) {
				validationResults.addAll(val.validator(validationRequest));
			}
		}
		
		
		showValidationResult(validationResults);
		saveFaillureResult(validationResults);
	}
	
	private void showValidationResult(List<ValidationResult> validationResults)
	{
		validationResults.forEach(val->System.out.println(val));
	}
}
