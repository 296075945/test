package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPx {

	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();  
        
        //创建3个学生对象，年龄分别是20、19、21，并将他们依次放入List中  
        A a = new A();  
        a.setA("aaa");
        a.setB("ccc");
        list.add(a);
        a = new A();  
        a.setA("bbb");
        a.setB("bbb");
        list.add(a);
        a = new A();  
        a.setA("aaa");
        a.setB("ccc");
        list.add(a);
        Collections.sort(list,new Comparator<A>(){

			@Override
			public int compare(A arg0, A arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
        	
        });
        
	}
}
class A {

	private String A;
	private String B;
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}

	
}
