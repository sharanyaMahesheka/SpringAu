package XMLtoCSV;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class XmlToCsv {

	 public static void main(String args[]) throws Exception {
	        File xmlSource = new File("C://Program Files (x86)//eclipse//AdvanceJavaAssignment//src//XMLtoCSV//data.xml");
	        File stylesheet = new File("C://Program Files (x86)//eclipse//AdvanceJavaAssignment//src//XMLtoCSV//stylesheet.xsl");



	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        Document document = builder.parse(xmlSource);

	        StreamSource stylesource = new StreamSource(stylesheet);
	        Transformer transformer = TransformerFactory.newInstance()
	                .newTransformer(stylesource);
	        Source source = new DOMSource(document);
	        Result outputTarget = new StreamResult(new File("C://Program Files (x86)//eclipse//AdvanceJavaAssignment//src//XMLtoCSV//result.csv"));
	        transformer.transform(source, outputTarget);

	 }
	 
}	 
