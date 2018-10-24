package com.img2txt.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainController {

	public static void main(String[] args) {

		try {
			File imageFile = new File("C:\\Users\\danda.n\\Desktop\\workspace\\W2_2.JPG");
			BufferedImage originalImgage = ImageIO.read(imageFile);
			// fixed x = 1200, y = 800, fixed for ssn--x = 280, 24, 290, 50
			// 1286 868
			System.out.println(
					"Original Image Dimension: " + originalImgage.getWidth() + "x" + originalImgage.getHeight());

			// BufferedImage SubImgage = originalImgage.getSubimage(295, 28, 300, 60);
			BufferedImage SubImgage = originalImgage.getSubimage((originalImgage.getWidth() / 100) * 25, 28,
					(originalImgage.getWidth() / 100) * 23, 60);
			File outputfile = new File("C:\\Users\\danda.n\\Desktop\\workspace\\croppedImage.jpg");
			ImageIO.write(SubImgage, "jpg", outputfile);

			System.out.println("Image cropped successfully: " + outputfile.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public File getSubImage(String imgType, String xPerc, String yPer, String widPer, String highPerc) {
		switch (imgType) {
		case "SSN":

			break;

		case "firstName":

			break;

		default:
			break;
		}
		return null;
	}

}
