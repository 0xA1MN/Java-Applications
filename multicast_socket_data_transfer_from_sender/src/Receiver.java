import java.io.*;
import java.net.*;

public class Receiver {
	public static void main(String[]args)throws Exception{
	    // TODO Auto-generated method stub
	    MulticastSocket m = new MulticastSocket(9999);
	    InetAddress add = InetAddress.getByName("224.1.1.1");
	    m.joinGroup(add);
	    byte [] bi = new byte[2000];
	    DatagramPacket dp=new DatagramPacket(bi,bi.length);
	    m.receive(dp);
	    System.out.println(new String(dp.getData()));

	}
}