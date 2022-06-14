package BookShop.JFSBookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MyBook {

	
	@Autowired
	
    public MyFavBooks myfavbooks;
	@Autowired
	public MyPersonalbook myPersonalBook;
	
	public MyBookInterface myBookInterface;
    
	@Value("HelloWorld")
    public String publisher;
 
	

	public MyFavBooks getMyfavbooks() {
		return myfavbooks;
	}

	public void setMyfavbooks(MyFavBooks myfavbooks) {
		this.myfavbooks = myfavbooks;
	}


public void show() {
	System.out.println("My Book Class Method");
	System.out.println(publisher);
	System.out.println(myfavbooks.author.toUpperCase());
	myfavbooks.myfavbooks();
	myfavbooks.my1stBook();
	
	myPersonalBook.my1stBook();
	
}

public int display() {
	int a = 100;
	System.out.println("Display Method");
	return a;
}
}
