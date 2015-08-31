package edia.work.sample.data_filter;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
 
import edia.work.sample.data.TextContentData;
import edia.work.sample.pojo.TextContent;

public class FilterViewModel {

    private static final String footerMessage = "A Total of %d texts";
    private TextContentFilter textContentFilter = new TextContentFilter();
    List<TextContent> currentTextContent = TextContentData.getAllTextContent();
 
    public TextContentFilter getTextContentFilter() {
        return textContentFilter;
    }
 
    public ListModel<TextContent> getTextContentModel() {
        return new ListModelList<TextContent>(currentTextContent);
    }
     
    public String getFooter() {
        return String.format(footerMessage, currentTextContent.size());
    }
 
    @Command
    @NotifyChange({"textContentModel", "footer"})
    public void changeFilter() {
        currentTextContent = TextContentData.getFilterTextContent(textContentFilter);
    }
    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
