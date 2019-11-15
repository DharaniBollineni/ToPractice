package selfLearning;

public class ThisPrintRefreanceID{  
void m(){  
System.out.println(this);//prints same reference ID  
}  
public static void main(String args[]){  
	ThisPrintRefreanceID obj=new ThisPrintRefreanceID();  
System.out.println(obj);//prints the reference ID  
obj.m();  
}  
}  