package com.myjava.factorypattern.upload.validation;

import java.util.Set;
import java.util.TreeSet;

import com.myjava.factorypattern.upload.attachment.Attachment;

public class ValidationRequest {

	private Set<Attachment> attachments = new TreeSet<>();
	
	private Set<Attachment> images = new TreeSet<>();

	public Set<Attachment> getAttachments() {
		return attachments;
	}

	public Set<Attachment> getImages() {
		return images;
	}
}
