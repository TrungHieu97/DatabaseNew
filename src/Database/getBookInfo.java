package DatabaseNew;

import java.io.IOException;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class getBookInfo {
	public static void main(String args[]) throws IOException {
		bookijfo book = new bookijfo();
		
		String link = "https://tiki.vn/tuoi-tre-dang-gia-bao-nhieu-p551563.html?ref=c8322.c316.c870.c871.c4148.c7498.c9127.";
		Document doc = (Document) Jsoup.connect(link).timeout(5000).get();

		Element page1 = doc.select("h1[class=item-name][itemprop=name][id=product-name]").first();
		//System.out.println(page1.ownText());
		
		Element e1 = doc.getElementById("product_id");
		//System.out.println(e1.attr("value"));
		
		Element e2 = doc.getElementById("productset_name");
		//System.out.println(e2.attr("value"));
		
		Element page2 = doc.select("a[target=_blank][href=/author/rosie-nguyen.html]").first();
		//System.out.println(page2.ownText());
		
		book.setName(page1.ownText());
		book.setAuthor(page2.ownText());
		book.setProductId(e1.attr("value"));
		book.setCategory(e2.attr("value"));
		
		System.out.println("Name :"     +book.getName());
		System.out.println("Author :"   +book.getAuthor());
		System.out.println("ID :"       +book.getProductId());
		System.out.println("Category :" +book.getCategory());
		
		
		
		
		
		
		
	
	}
	
		
}
	


