
public class Methodover2 {

	public static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.Camera();
		Nokia n1= new Nokia();
		n1.Camera();
		Iphone i1= new Iphone();
		i1.Camera();
		Mobile m2= i1;// upcasting dirctly 
		m2.Camera();
		Mobile m3= new Iphone();// upcasting by creating object for Iphone class
		m3.Camera();
		
	}
}
class Mobile{
	void Camera() {
		System.out.println("no camera");
	}
}

class Nokia extends Mobile{
	void Camera() {
		System.out.println("1 camera");
	}
}
class Iphone extends Mobile{
	void Camera(){
		System.out.println("3 Camera");
	}
}
