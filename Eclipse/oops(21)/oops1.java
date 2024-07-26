package demo01;
class box{
	int length;
	int breadth;
	int height;
}
public class oops1 {
//box create panrom using class
	public static void main(String[] args) {
		box Blackbox;
		Blackbox=new box();
		Blackbox.length=78;
		Blackbox.breadth=87;
		 
		// creating an another new black box.
		// black box ku thaniya values store pannikilam 
		// woodbox ku thaniya values store pannikilam en na namma tha thani thani ya new boxes create pannirkom.memory la thani thani ya address create agiruum. 
		box woodbox=new box();
		woodbox.breadth=90;
		woodbox.length=9;
		
		System.out.println(Blackbox.length);
		System.out.println(Blackbox.breadth);
		System.out.println(woodbox.breadth);
		System.out.println(woodbox.length);
	}

}
