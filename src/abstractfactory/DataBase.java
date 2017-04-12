package abstractfactory;

import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class DataBase {
	private static String databaseName = null;
	
	static{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}     
        Document document = null;
		try {
			document = builder.parse("src\\abstractfactory\\Settings.xml");
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}  
        Element database = (Element) document.getDocumentElement();
        databaseName = database.getAttribute("Name");
	}
	
	public static IUser getUserHandler() 
			throws InstantiationException, 
			IllegalAccessException, 
			ClassNotFoundException {
		String classname = "abstractfactory." + databaseName + "User";
		return (IUser) Class.forName(classname).newInstance();
	}
	
	public static IDepartment getDepartmentHandler() 
			throws InstantiationException, 
			IllegalAccessException, 
			ClassNotFoundException {
		String classname = "abstractfactory." + databaseName + "Department";
		return (IDepartment) Class.forName(classname).newInstance();
	}
}
