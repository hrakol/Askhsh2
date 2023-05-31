package gr.upatras.junit.first;
public class MyClass {

 public String subtract(int x, int y) {
	 if ((x - y) > 0) {
		 return "positive";
	 }
	 if ((x - y) < 0) {
		 return "negative";
	 }
	 else return "0";
 	}
}

