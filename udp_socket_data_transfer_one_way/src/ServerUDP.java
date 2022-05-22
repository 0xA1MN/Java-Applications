import java.io.*;
import java.net.*;

public class ServerUDP {
	public static void main(String[]args)throws IOException{
	    // TODO Auto-generated method stub
	    DatagramSocket server=new DatagramSocket(9999);
	    byte[]b=new byte[2000];
	    DatagramPacket pkt=new DatagramPacket(b,b.length);
	    server.receive(pkt);
	    String response=new String(pkt.getData());
	    System.out.println(response);
	    server.close();
	}
}
