package edia.work.sample.pojo;

import java.util.Date;

public class TextContent {

	private String newtext;
    private Date datecreation;
    private String oldtext;
    private Date datemodification;
    private String title;
 
    public TextContent(String newtext, Date datecreation, String oldtext, 
    		Date datemodification, String title) {
        this.newtext = newtext;
        this.datecreation = datecreation;
        this.oldtext = oldtext;
        this.datemodification = datemodification;
        this.title = title;
    }
 
    public String getNewtext() {
        return newtext;
    }
 
    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
 
    public String getOldtext() {
        return oldtext;
    }
 
    public void setDatemodification(Date datemodification) {
        this.datemodification = datemodification;
    }
 
    public String getTitle() {
        return title;
    }
 

    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
