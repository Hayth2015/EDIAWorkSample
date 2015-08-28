package edia.work.sample.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import edia.work.sample.pojo.TextContent;
import edia.work.sample.data_filter.TextContentFilter;


	public class TextContentData {
	 
	    private static List<TextContent> texts = new ArrayList<TextContent>();
	    static {
	    	
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
