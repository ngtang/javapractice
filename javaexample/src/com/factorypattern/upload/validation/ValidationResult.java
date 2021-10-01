package com.factorypattern.upload.validation;

public class ValidationResult {
	private String fileName;
	private boolean valid;
	private String errorMessage;

	ValidationResult(String fileName, boolean valid, String errorMessage) {
		this.fileName = fileName;
		this.valid = valid;
		this.errorMessage = errorMessage;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return String.format("filename: %s, valid: %s, error message: %s", this.fileName, this.valid,
				this.errorMessage);
	}

}
