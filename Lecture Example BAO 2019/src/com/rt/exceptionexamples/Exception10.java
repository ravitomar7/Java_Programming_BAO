package com.rt.exceptionexamples;

class Exception10 {
// Through an exception out of the method.
static void procA() {
System.out.println("Database Initialized");
System.out.println("inside procA");
try
{
throw new RuntimeException("demo");
}
finally {
System.out.println("Database Closed");
}

}
// Return from within a try block.
static void procB() {
try {
System.out.println("inside procB");
return ;

} finally {
System.out.println("procB's finally");
}
}
static void procC() {
try {
System.out.println("inside procC");
System.exit(0);
} finally {
System.out.println("procC's finally");
}
}
public static void main(String args[]) {
try {
procA();
} catch (Exception e) {
System.out.println("Exception caught");
}
procB();
procC();



}
}