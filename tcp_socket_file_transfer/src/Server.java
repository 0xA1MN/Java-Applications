import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[]args)throws IOException{
	    // TODO Auto-generated method stub
	    ServerSocket ss = new ServerSocket(9999);
	    Socket s = ss.accept();
	    InputStream ins=s.getInputStream();
	    FileOutputStream fo=new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\distributed\\tcp_socket_file_transfer\\Recieved.txt");
	    byte[]b=new byte[4000];
	    ins.read(b,0,b.length);
	    fo.write(b,0,b.length);
	    ss.close();
	}
}
