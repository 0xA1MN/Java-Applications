import java.io.*;
import java.net.*;

public class ClientUDP {
	public static void main(String[]args)throws IOException{
		   // TODO Auto-generated method stub
		   DatagramSocket client=new DatagramSocket();
		   FileInputStream fi=new FileInputStream("C:\\Users\\Mohamed\\Desktop\\distributed\\tcp_socket_file_transfer\\Sockets.txt");
		   byte[] c =new byte[3000];
		   fi.read(c,0,c.length);
		   DatagramPacket pkt=new DatagramPacket(c,c.length,InetAddress.getByName("localhost"),9999);
		   client.send(pkt);
		   client.close();
		}
}
