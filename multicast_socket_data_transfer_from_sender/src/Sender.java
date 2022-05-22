
import java.io.*;
import java.net.*;

public class Sender {
	public static void main(String[]args)throws Exception{
	    // TODO Auto-generated method stub
	   MulticastSocket m =new MulticastSocket();
	   InetAddress add = InetAddress.getByName("224.1.1.1");
	   int port = 9999;
	   m.joinGroup(add);
	   String word="Message from sender";
	   DatagramPacket dp=new DatagramPacket(word.getBytes(),word.length(),add,port);
	   m.send(dp);
	   m.close();
	}	
}