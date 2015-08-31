package edia.work.sample.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edia.work.sample.pojo.TextContent;
import edia.work.sample.data_filter.TextContentFilter;
import edia.work.sample.db.connection.DbContract;
import edia.work.sample.db.connection.PostgresHelper;


public class TextContentData {

	private static List<TextContent> texts = new ArrayList<TextContent>();
	static {


//		PostgresHelper client = new PostgresHelper(
//				DbContract.HOST,
//				DbContract.DB_NAME,
//				DbContract.USERNAME,
//				DbContract.PASSWORD);
//		try {
//			if (client.connect()) {
//				System.out.println("DB connected");
//
//				ResultSet rs = client.execQuery("SELECT * FROM textcontent");
//				while(rs.next()) {
//					//			    System.out.printf("%s\t%d\t%s\t%d\t%s\n",
//					//			            rs.getString(1),
//					//			            rs.getString(2),
//					//			            rs.getString(3),
//					//			            rs.getInt(4));
//					texts.add(new TextContent(rs.getString(2), rs.getDate(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
//
//				}
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//


		//TODO Retrieve data from database
		texts.add(new TextContent("Work Sample 5", null, "", null, "EDIA Work Sample"));
		texts.add(new TextContent("Work Sample 6", null, "", null, "Text 6"));
		texts.add(new TextContent("Work Sample 7", null, "", null, "Work Sample EDIA"));
	}

	public static List<TextContent> getAllTextContent() {
		return new ArrayList<TextContent>(texts);
	}
	public static TextContent[] getAllTextContentArray() {
		return texts.toArray(new TextContent[texts.size()]);
	}

	// This Method only used in "Data Filter"
	public static List<TextContent> getFilterTextContent(TextContentFilter textContentFilter) {
		List<TextContent> someTextContent = new ArrayList<TextContent>();
		String nm = textContentFilter.getTitle().toLowerCase();

		for (Iterator<TextContent> i = texts.iterator(); i.hasNext();) {
			TextContent tmp = i.next();
			if (tmp.getTitle().toLowerCase().contains(nm)) {
				someTextContent.add(tmp);
			}
		}
		return someTextContent;
	}

	// This Method only used in "Header and footer"
	public static List<TextContent> getTextContentByTitle(String title) {
		List<TextContent> someTextContent = new ArrayList<TextContent>();
		for (Iterator<TextContent> i = texts.iterator(); i.hasNext();) {
			TextContent tmp = i.next();
			if (tmp.getTitle().equalsIgnoreCase(title)){
				someTextContent.add(tmp);
			}
		}
		return someTextContent;
	}

	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//
	//	}

}
