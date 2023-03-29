package exc07.exam03;

public class HttpServletEx {
	public static void main(String[] args) {
		
		method(new Login());
		method(new Download());
		
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
