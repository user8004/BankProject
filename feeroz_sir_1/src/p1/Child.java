package p1;
class Parent {

	static void method1() {
    	System.out.println("From parent static method1()");
	}

	void method2() {
    	System.out.println("From parent non-static(instance) method2()");
	}
}

class Child extends Parent {
//This method hides method1() in Parent

	static void method1() {
    	System.out.println("From child static method1()");
	}
//This method overrides method2() in Parent

	@Override
	public void method2() {
    	System.out.println("From child non-static(instance) method2()");
	}
}
//Driver class

class MethodOverriding {

	public static void main(String[] args) {
    	Parent obj1 = new Child();
    	obj1.method1();
    	obj1.method2();
	}
}





