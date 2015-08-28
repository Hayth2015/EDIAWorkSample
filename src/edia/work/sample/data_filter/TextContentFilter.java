package edia.work.sample.data_filter;

public class TextContentFilter {

    private String title="";
    
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title==null?"":title.trim();
    }
 
    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
