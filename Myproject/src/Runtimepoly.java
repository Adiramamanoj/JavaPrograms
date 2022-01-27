// Run time polymorphism by method overriding 
public class Runtimepoly {

	public static void main(String[] args) {
		
		Debitcard d=new Debitcard();
		Swipe s=new Swipe();
		s.swipingmachince(d);
		Creditcard cc=new Creditcard();
		s.swipingmachince(cc);
	}

}
class Card{
	void makingpayment() {
		System.out.println("making payment");
	}
}
class Debitcard extends Card{
	void makingpayment() {
		System.out.println("making payment through debit card");// it will override the first statement in class Card after accessing
		                                                        // through object of class Card c by giving to swipe class by object of d
	}
}
class Creditcard extends Card{
	void makingpayment() {
		System.out.println("making the payment through the credit card");//it will override the first statement in class Card after accessing
                                                                           // through object of class Card c by giving to sipe class by object of cc
	}
}
class Swipe{
	void swipingmachince(Card c) {
		c.makingpayment();
	}
}
