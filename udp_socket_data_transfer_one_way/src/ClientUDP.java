import java.io.*;
import java.net.*;

public class ClientUDP {
	public static void main(String[]args)throws IOException{
 	    DatagramSocket client=new DatagramSocket();
	    String word = "Hello";
	    byte[] b = word.getBytes();
	    DatagramPacket pkt = new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),9999);
	    client.send(pkt);
	    client.close();
	}
}