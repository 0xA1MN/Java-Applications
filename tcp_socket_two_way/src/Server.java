import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[]args)throws Exception{
	    // TODO Auto-generated method stub
	   ServerSocket ss=new ServerSocket(9978);
	   Socket s = ss.accept();
	    InputStreamReader ipt=new InputStreamReader(s.getInputStream());
	    BufferedReader bf=new BufferedReader(ipt);
	    System.out.println(bf.readLine());
	    // Sending Data to client
	   OutputStream os=s.getOutputStream();
	    PrintWriter ptn=new PrintWriter(os);
	    ptn.print("socket Programming");
	    ptn.flush();
	    ss.close();
	}
}
