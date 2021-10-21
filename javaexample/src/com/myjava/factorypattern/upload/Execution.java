package com.myjava.factorypattern.upload;

import com.myjava.factorypattern.upload.attachment.AttachmentSet;

public class Execution {

	public static void main(String[] args) {
		AttachmentSet attachments = new AttachmentSet();
		attachments.initial();
		attachments.print();
		attachments.doValidation();
	}

}
