public class Driver {
    public static void main(String[] args){
	mystack<String> s = new mystack<String>();
	s.push("hello");
	s.push("world");
	System.out.println(s.toString());
	s.pop();
	System.out.println(s.toString());
	System.out.println(s.top());
	
    }
}
