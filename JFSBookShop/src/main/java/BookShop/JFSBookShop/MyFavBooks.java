package BookShop.JFSBookShop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MyFavBooks implements MyBookInterface {
	
	@Value("#{125 + 25}")
	public int fvbid;
	@Value("JK Rowling")
	public String fvbname;
	@Value("AbdulKalam")
	public String author;
	
	public void myfavbooks() {
		System.out.println("myfav method");
	}

	@Override
	public String toString() {
		return "MyFavBooks [fvbid=" + fvbid + ", fvbname=" + fvbname + ", author=" + author + "]";
	}

	@Override
	public void my1stBook() {
		// TODO Auto-generated method stub
		System.out.println("Interface method implemented inside the fav book class");
	}


	
	
	
	
	
}
