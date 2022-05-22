import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[]args)throws IOException{
	    Socket s = new Socket("localhost",9999);
	    FileInputStream file = new FileInputStream("C:\\Users\\Mohamed\\Desktop\\distributed\\tcp_socket_file_transfer\\Sendingfile.txt");
	    byte[]b=new byte[4000];
	    file.read(b,0,b.length);
	    OutputStream os=s.getOutputStream();
	    os.write(b,0,b.length);
	    s.close();
	}
}
