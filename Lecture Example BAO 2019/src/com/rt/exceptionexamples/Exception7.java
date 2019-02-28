package com.rt.exceptionexamples;

class Exception7 {
static void demoproc() {
try {
throw new NullPointerException("demo");
} catch(NullPointerException e) {
System.out.println("Caught inside demoproc.");
throw new ArithmeticException(); // rethrow the exception
}
}
public static void main(String args[]) {
try {
demoproc();
} catch(ArithmeticException e) {
System.out.println("Recaught: " + e);
}
}
}