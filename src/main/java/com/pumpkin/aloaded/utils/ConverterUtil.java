package com.pumpkin.aloaded.utils;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 名称： ConverterUtil<br>
 * 描述： 图片转换类<br>
 * 最近修改时间：2015/8/1 13:26<br>
 * 修改说明：
 * 
 * @author jiajl
 */
public class ConverterUtil {

	// JGP格式
	public static final String JPG = "jpeg";
	// GIF格式
	public static final String GIF = "gif";
	// PNG格式
	public static final String PNG = "png";
	// BMP格式
	public static final String BMP = "bmp";

	public static void converterAndScale(File imgFile, String format,
			File formatFile, int width, int height) {
		BufferedImage srcFile = null;
		try {
			srcFile = ImageIO.read(imgFile);
			Image image = srcFile.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = tag.createGraphics();
			g.drawImage(image, 0, 0, null);
			g.dispose();
			ImageIO.write(tag, format, formatFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 图像格式转换
	 */
	/*
	 * 图像缩放
	 */
	public static void scale(String srcImageFile, String result, int width,
			int height, String ext) {
		BufferedImage srcFile = null;
		try {
			srcFile = ImageIO.read(new File(srcImageFile)); // 读入文件
			Image image = srcFile.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			// Graphics2D g = tag.createGraphics();
			g.drawImage(image, 0, 0, null); // 绘制后的图
			g.dispose();
			ImageIO.write(tag, ext, new File(result));// 输出到文件流
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			srcFile.flush();
		}

	}

	/*
	 * 图像缩放
	 */
	public static void scale(String srcImageFile, String result, int scale,
			boolean flag, String ext) {
		BufferedImage srcFile = null;
		try {
			srcFile = ImageIO.read(new File(srcImageFile)); // 读入文件
			int width = srcFile.getWidth(); // 源图宽
			int height = srcFile.getHeight(); // 源图长
			if (flag) {// 放大
				width = width * scale;
				height = height * scale;
			} else {// 缩小
				width = width / scale;
				height = height / scale;
			}
			Image image = srcFile.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			// Graphics g = tag.getGraphics();
			Graphics2D g = tag.createGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			ImageIO.write(tag, ext, new File(result));// 输出到文件流
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			srcFile.flush();
		}
	}
}
