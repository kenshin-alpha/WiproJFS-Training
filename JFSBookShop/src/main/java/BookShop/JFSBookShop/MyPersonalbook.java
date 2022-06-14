package BookShop.JFSBookShop;

import org.springframework.stereotype.Component;

@Component
public class MyPersonalbook implements MyBookInterface{

	@Override
	public void my1stBook() {
		System.out.println("Interface method from personal book class");
	}
}
