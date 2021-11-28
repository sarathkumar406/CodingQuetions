import java.io.*;
class Parent{  
  void msg() throws NullPointerException {System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent{  
  void msg()throws IOException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]) throws Exception{  
   Parent p=new TestExceptionChild();  
   p.msg();  
  }  
}  