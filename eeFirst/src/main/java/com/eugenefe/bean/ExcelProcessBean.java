package com.eugenefe.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.BLACK;
import org.apache.poi.hssf.util.HSSFColor.GREY_25_PERCENT;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.slf4j.Logger;

@Named
@SessionScoped
public class ExcelProcessBean implements Serializable{
	@Inject	private Logger logger;
	 
	
	public void postProcessXLS(Object document) {
		HSSFWorkbook wb = (HSSFWorkbook) document;
		HSSFSheet sheet = wb.getSheetAt(0);
		
//		logger.info("rowSize : {},{}", sheet.getFirstRowNum(), sheet.getLastRowNum());
		HSSFRow header = sheet.getRow(0);
		HSSFCellStyle headerCellStyle = wb.createCellStyle();
		HSSFCellStyle cellStyle = wb.createCellStyle();
		
		
		headerCellStyle.setFillForegroundColor(GREY_25_PERCENT.index);
		headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		headerCellStyle.setBorderBottom(BorderStyle.THIN);
		headerCellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		
		headerCellStyle.setBorderLeft(BorderStyle.THIN);
		headerCellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		
		headerCellStyle.setBorderRight(BorderStyle.THIN);
		headerCellStyle.setRightBorderColor(HSSFColor.BLACK.index);
		
		headerCellStyle.setBorderTop(BorderStyle.THIN);
		headerCellStyle.setTopBorderColor(HSSFColor.BLACK.index);
		
		
		
//		cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
//		cellStyle.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
//		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);     //색 패턴 설정
		
		cellStyle.setBorderBottom(BorderStyle.THIN);
		cellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		
		cellStyle.setBorderLeft(BorderStyle.THIN);
		cellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setRightBorderColor(HSSFColor.BLACK.index);
		
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setTopBorderColor(HSSFColor.BLACK.index);
		
		
		for(int i=sheet.getFirstRowNum(); i<=sheet.getLastRowNum(); i++){
			HSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				row.getCell(j).setCellStyle(cellStyle);
			}
		}
		
		for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
			header.getCell(i).setCellStyle(headerCellStyle);
			sheet.autoSizeColumn(i);
		}
	}

}