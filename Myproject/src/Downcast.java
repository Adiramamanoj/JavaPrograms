
public class Downcast {

	public static void main(String[] args) {
		O o1= new O();
		System.out.println(o1.i);
		System.out.println(o1.j);
		System.out.println(o1.k);
		K k1=new K();
		System.out.println(k1.i);
		System.out.println(k1.j);
		//System.out.println(k1.k);
		J j1= new J();
		System.out.println(j1.i);
		//System.out.println(j1.j);
		//System.out.println(j1.k);
		J j2=new J();
		K k2=(K)j2;// directly down casting the super class to sub class 
		System.out.println(k2.j); // class cast execption 
		J j3= new J();
		//System.out.println(j3.k);
		
	}

}
class J{
	int i;
}
class K extends J{
	int j;
}
class O extends K{
	int k;
}
