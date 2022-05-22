import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[]args)throws Exception{
		   Socket s = new Socket("localhost",9978);
		   OutputStream o = s.getOutputStream();
		    PrintWriter ptw= new PrintWriter(o);
		    ptw.print("welcome To Sockets");
		    ptw.flush();
		    s.close();
		}
}
