package com.myjava.factorypattern.upload.attachment;

import java.util.Scanner;

public abstract class Attachment implements Comparable<Attachment> {
	private String filename;
	private String content;
	private double size;

	public Attachment() {
	}

	public Attachment(String filename, String content, double size) {
		this.filename = filename;
		this.content = content;
		this.size = size;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("File Infomation :\nInput file name: ");
		this.filename = sc.nextLine();
		System.out.print("Input file content: ");
		this.content = sc.nextLine();
		System.out.print("Input file size: ");
		this.size = Double.parseDouble(sc.nextLine());
		fill();
		sc.close();
	}

	public void show() {
		System.out.println("File name: " + this.filename);
		System.out.println("File content: " + this.content);
		System.out.println("File size: " + this.size);
		display();
	}

	public abstract void display();

	public abstract void fill();

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Attachment || o == null)) {
			return false;
		}
		Attachment att = (Attachment) o;
		if (att.getFilename() == this.filename)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return filename.hashCode();
	}

	@Override
	public int compareTo(Attachment o) {
		return this.filename.toLowerCase().compareTo(o.getFilename().toLowerCase());
	}

}
