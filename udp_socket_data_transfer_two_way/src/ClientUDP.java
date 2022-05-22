import java.io.*;
import java.net.*;

public class ClientUDP {
	public static void main(String[]args)throws IOException{
	   // TODO Auto-generated method stub
	   DatagramSocket client = new DatagramSocket();
	   String word = "Hello";
	   byte[] b = word.getBytes();
	   DatagramPacket pkt=new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),9999);
	   client.send(pkt);
	   byte[]b2=new byte[2000];
	   DatagramPacket pkt2=new DatagramPacket(b2,b2.length);
	   client.receive(pkt2);
	   String response=new String(pkt2.getData());
	   System.out.println(response);
	   client.close();
	}
}
