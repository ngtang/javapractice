package com.myjava.factorypattern.upload.attachment;

import java.util.Scanner;

import com.myjava.factorypattern.upload.enumdata.ImageSize;
import com.myjava.factorypattern.upload.enumdata.ImageType;

public class Image extends Attachment {
	private ImageType imageType;
	private ImageSize imageScale;

	public Image() {
	}

	public Image(String filename, String content, double size, ImageType imageType, ImageSize imageScale) {
		super(filename, content, size);
		this.imageType = imageType;
		this.imageScale = imageScale;
	}

	@Override
	public void fill() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input image type: ");
		ImageType imageType = findImageType(sc.nextLine());
		if (imageType != null) {
			this.imageType = imageType;
		} else {
			sc.close();
			throw new IllegalArgumentException("Incorrect image type");
		}
		System.out.print("Input image scale: ");
		ImageSize imageSize = findImageSize(sc.nextLine());
		if (imageSize != null) {
			this.imageScale = imageSize;
		} else {
			sc.close();
			throw new IllegalArgumentException("Incorrect image scale");
		}
		this.imageScale = findImageSize(sc.nextLine());
		sc.close();
	}

	private ImageType findImageType(String name) {
		ImageType[] imgTypes = ImageType.values();
		for (ImageType imgTyp : imgTypes) {
			if (name.equalsIgnoreCase(imgTyp.name()))
				return imgTyp;
		}
		return null;
	}

	private ImageSize findImageSize(String name) {
		return null;
	}

	@Override
	public void display() {
		System.out.println("Input image type: " + this.imageType);
		System.out.println("Input image scale: " + this.imageScale.getDescription());
	}
}
