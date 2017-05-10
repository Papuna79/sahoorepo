//package com.gs.icbcs;
import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.*;
import org.w3c.dom.*;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class XMLTOEXCEL
{	
	 
	 private static List<RowData>rowDataList = new ArrayList<RowData>() ;
	 private static String excelFilePath = "E:\\SampleCode\\XMLTOE\\generated.xls";
	 public void generateExcel(File xmlDocument)
	 {
		 try
		 {
		/* // Creating a Workbook
			 HSSFWorkbook wb = new HSSFWorkbook();
			 HSSFSheet spreadSheet = wb.createSheet("spreadSheet");
			 spreadSheet.setColumnWidth((short) 0, (short) (256 * 25));
			 spreadSheet.setColumnWidth((short) 1, (short) (256 * 25));*/
			 // Parsing XML Document
			 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			 DocumentBuilder builder = factory.newDocumentBuilder();
			 Document document = builder.parse(xmlDocument);
			
			/*  // Creating Rows
			 HSSFRow row = spreadSheet.createRow(0);
			 HSSFCell cell=row.createCell((short) 0);
			 cell.setCellValue("Input Field Name");
			 cell = row.createCell((short) 1);
			 cell.setCellValue("XPath");
			 cell = row.createCell((short) 2);
			 cell.setCellValue("Sample Value");	*/
			 
             // normalize text representation	
             document.getDocumentElement().normalize();
             System.out.println("Root element of the doc is :\" "+ document.getDocumentElement().getNodeName() + "\"");
             NodeList nodeList = document.getElementsByTagName("sbl");
             System.out.println(nodeList.getLength());
             for (int temp = 0; temp < nodeList.getLength(); temp++) {
            	 Node nNode = nodeList.item(temp);
            	 System.out.println("\nCurrent Element :" + nNode.getNodeName()  +  "             " + nNode.getChildNodes().getLength());
            	 childList(nNode);
             }
             writeExcel();
			 // Outputting to Excel spreadsheet
			 /*FileOutputStream output = new FileOutputStream(new File("generated.xls"));
			 wb.write(output);
			 output.flush();
			 output.close();*/
			 }
		 catch (IOException e)
		 {
			System.out.println("IOException " + e.getMessage());
		 }  
	     catch (ParserConfigurationException e) 
	     {
         System.out.println("ParserConfigurationException " + e.getMessage());
         } 
	     catch (SAXException e) 
	     {
         System.out.println("SAXException " + e.getMessage());
         }
		 
	 
	 }
	public static void main(String args[])
	{
	  File xmlDocument = new File(".//src/input.xml");

      XMLTOEXCEL excel = new XMLTOEXCEL();
      excel.generateExcel(xmlDocument);
      //RowData xp=new RowData();
	}
	
	public static void childList(Node parentnode){
		NodeList nodeList = parentnode.getChildNodes();
		//System.out.println("Child size : - " + nodeList.getLength());
		//if(nodeList.getLength() > 1 )
		//{
				for (int temp = 0; temp < nodeList.getLength(); temp++) {
					Node nNode = nodeList.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							System.out.println("Current Node Name : -  " + nNode.getNodeName() + "\t  Xpath :-"+getXPath(nNode) + " \t attr val = " +  (nNode.getAttributes() != null && nNode.getAttributes().getLength() > 0 ?  nNode.getAttributes().item(0).getNodeName():"" ));
							populateRowData(nNode);
				       		if( nNode.getChildNodes().getLength() >0 ){
				       			childList(nNode);
				       		}
				       		else{
				       			//System.out.println("Child Node Name : -  " + nNode.getNodeName() + "\t Child Xpath :-"+getXPath(nNode) + " \t attr val = " +  (nNode.getAttributes() != null && nNode.getAttributes().getLength() > 0 ?  nNode.getAttributes().item(0).getNodeValue():"" ));
				       		}
					}
					
				}
		//}else{
			// System.out.println("Parent Node Name : -  " + parentnode.getNodeName() + "\t Parent Xpath :-"+getXPath(parentnode));
		//}
	}
	
	
	 public static String getXPath(Node node) {
         return getXPath(node, "");
     }
	 
	 public static void populateRowData(Node currentNode){
		 
		 RowData currRowData = new RowData();
		 currRowData.setNodeName(currentNode.getNodeName());
		 currRowData.setNodeXPath(getXPath(currentNode));
		 if(currentNode.hasChildNodes()){
			 if(currentNode.getChildNodes().getLength() == 1)
			 {
				 currRowData.setNodeSampleValue(currentNode.getTextContent());
			 }
		 }
		 rowDataList.add(currRowData);
		 
	 }
	 //The method that writes  to an Excel file
	 public void writeExcel() throws IOException {
		 HSSFWorkbook workbook = new HSSFWorkbook();
		 HSSFSheet sheet = workbook.createSheet();
		 
		    int rowCount = 0;
		 
		    for (RowData currRowData : rowDataList) {
		    	HSSFRow row = sheet.createRow(++rowCount);
		        writeSheet(currRowData, row);
		    }
		 
		    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
		        workbook.write(outputStream);
		    }
		}
	//The method that writes information to cells:
	 private void writeSheet(RowData currRowData, HSSFRow row) {
		 
		 	HSSFCell cell= row.createCell((short) 0);
		 	
		    cell.setCellValue(new HSSFRichTextString(currRowData.getNodeName()));
		 
		    cell = row.createCell((short) 1);
		    cell.setCellValue(new HSSFRichTextString(currRowData.getNodeXPath()));
		 
		    cell = row.createCell((short) 2);
		    cell.setCellValue(new HSSFRichTextString(currRowData.getNodeSampleValue()));
	}

	 
     public static String getXPath(Node node, String xpath) {
         if (node == null) {
             return "";
         }
         String elementName = "";
         if (node instanceof Element) {
             elementName = ((Element) node).getNodeName();
         }
         Node parent = node.getParentNode();
         if (parent == null) {
             return xpath;
         }
      
         return getXPath(parent, "/" + elementName + xpath);
     }
}