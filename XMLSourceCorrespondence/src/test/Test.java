package test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sc.SourceCorrespondence;
import org.xml.sc.SourcePreservingXMLParser;

public class Test {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		File xmlFile = new File("test.xml");
		InputStream xml = new DataInputStream(new FileInputStream(xmlFile));
		Document doc = SourcePreservingXMLParser.parse(xml);

		NodeList nList = doc.getElementsByTagName("staff");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				SourceCorrespondence sc = SourcePreservingXMLParser.getSourceCorrespondence(eElement);
				System.out.println(eElement.toString() + " is at " + sc.toString());
				
//				System.out.println("Staff id : " + eElement.getAttribute("id"));
//				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

			}
		}

		
	}

}
