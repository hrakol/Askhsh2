package gr.upatras.junit.first;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MyClassTest {
 @Test
 void testSubtract() {
	 MyClass tester = new MyClass();
	 assertEquals("negative", tester.subtract(5, 9), "The result should be negative");
 }
 @Test
 void tesSubtract1() {
	 MyClass tester = new MyClass();
	 assertEquals("positive", tester.subtract(129, 9), "The result should be positive");
 } 
 @Test
 void tesSubtract2() {
	 MyClass tester = new MyClass();
	 assertEquals("zero", tester.subtract(9, 9), "The result should be zero");
 } 
 }
