package chap10.リスト10_06;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) throws Exception {
		String fileName = "rpg.xml";
		InputStream is = new FileInputStream(fileName);

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(is);

		Element hero	= doc.getDocumentElement();
		Element weapon	= findChildByTag(hero, "weapon");
		Element power	= findChildByTag(weapon, "power");

		String val = power.getTextContent();
		System.out.println(val);


		is.close();
	}

	private static Element findChildByTag(Element self, String target) throws Exception {
		NodeList children = self.getChildNodes();
		for (int i=0; i < children.getLength(); i++) {
			Object node = children.item(i);

			if (!(node instanceof Element))
				continue;

			Element element = (Element) node;
			String tagName = element.getTagName();
			if (tagName.equals(target))
				return element;
		}

		return null;
	}

}
