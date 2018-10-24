package com.img2txt.util;

import java.awt.image.BufferedImage;

public class Util {

	public static BufferedImage cropImage(BufferedImage bufferedImage, int x, int y, int width, int height){
	    BufferedImage croppedImage = bufferedImage.getSubimage(x, y, width, height);
	    return croppedImage;
	}
}
