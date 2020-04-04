package com.qa.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.qa.BaseTest;

public class TestUtils {

	public static final long WAIT=30;


	public HashMap<String, String> paseStringXML(InputStream file) throws Exception{
		HashMap<String, String> stringmap= new HashMap<String, String>();

		//get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		//Build Document
		Document document = builder.parse(file);
		//Normalize the xml stracture; its just to important
		document.getDocumentElement().normalize();
		//here comes the root node
		Element root = document.getDocumentElement();
		//		System.out.println(root.getNodeName());
		//get all elements
		NodeList nlist = document.getElementsByTagName("string");
		//		System.out.println("====================================");
		for(int temp=0; temp<nlist.getLength(); temp++) {
			Node node = nlist.item(temp);
			System.out.println(""); //just a separator
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element eElement=(Element) node;
				//store each element key value in map
				stringmap.put(eElement.getAttribute("name"), eElement.getTextContent());

			}
		}
		return stringmap;
	}

	public String DateTime() {


		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	}

public void log(String txt) {
	BaseTest  base= new BaseTest();
	String msg=Thread.currentThread().getId()+":"+ base.getPlatform()+":"+base.getDeviceName()+ ":"
	+Thread.currentThread().getStackTrace()[2].getClassName() +":" + txt;
	System.out.println(msg);
	
	String strFile ="logs" + File.separator + base.getPlatform()+ "_"+base.getDeviceName() + File.separator+base.getDateTime();
	File logFile = new File(strFile);
	if(!logFile.exists()) {
		
		logFile.mkdirs();
	}
	FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter(logFile + File.separator + "log.txt", true);
	}catch(IOException e) {
		e.printStackTrace();
	}
	PrintWriter printWriter =new PrintWriter(fileWriter);
	printWriter.print(msg);
	printWriter.close();
}
	public Logger log() {
		return  LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}	




}
