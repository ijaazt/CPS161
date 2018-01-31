package blog_entry;
import java.util.Date;
import java.util.StringTokenizer;

public class BlogEntry {
	String username;
	String entryText;
	String entryDate;
	

	public BlogEntry (String username, String entryText, Date entryDate) {
		this.username = username;
		this.entryText = entryText;
		this.entryDate = entryDate.toString();
	}
	
	public void displayEntry() {
		System.out.println("Username: " + username);
		System.out.println("Entry text: " + entryText);
		System.out.println("Entry Date: " + entryDate);
	}
	
	public String getSummary() {
		String[] entryTextSplit = entryText.split(" ");
		String summary = "";
		for(String sentence : entryTextSplit) {
			summary += sentence + " ";
		}
		return summary;
	}
}
