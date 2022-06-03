package app;

public class UseTransporteur {

	public static void main(String args[])
	{
		Tunitransport tun = new Tunitransport();
		tun.transporter("Hello");
		tun.transporter(12);
		
		Jumia<String> j = new Jumia();
		Aramex a = new Aramex();
		a.transporter(new Animal());
	}
}
