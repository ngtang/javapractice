package com.factorypattern.upload.attachment;

import java.util.Date;
import java.util.Scanner;

public class Document extends Attachment {

	private String author;
	private Date receivedDate;

	public Document() {
	}

	public Document(String filename, String content, double size, String author) {
		super(filename, content, size);
		this.author = author;
		this.receivedDate = new Date();
	}

	@Override
	public void fill() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input file author: ");
		this.author = sc.nextLine();
		this.receivedDate = new Date();
		sc.close();
	}

	@Override
	public void display() {
		System.out.println("File author: " + this.author);
		System.out.println("Image received date: " + this.receivedDate);

	}

}
