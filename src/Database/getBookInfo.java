package Database;

import java.io.IOException;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class getBookInfo {
	public static void main(String args[]) throws IOException {
		String link = "https://tiki.vn/tuoi-tre-dang-gia-bao-nhieu-p551563.html?ref=c8322.c316.c870.c871.c4148.c7498.c9127.";
		Document doc = (Document) Jsoup.connect(link).timeout(5000).get();
		Element page = doc.select("div[class=title]").first();
		System.out.println(page.ownText());
		
	}
	

}
