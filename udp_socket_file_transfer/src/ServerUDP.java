import java.io.*;
import java.net.*;

public class ServerUDP {
	public static void main(String[]args)throws IOException{
	    // TODO Auto-generated method stub
	    DatagramSocket server=new DatagramSocket(9999);
	    byte[]b=new byte[2000];
	    DatagramPacket pkt=new DatagramPacket(b,b.length);
	    server.receive(pkt);
	    FileOutputStream fo=new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\distributed\\tcp_socket_file_transfer\\UDPfile.txt");
	    byte[] c = pkt.getData();
	    fo.write(c,0,c.length);
	    server.close();
	}
}