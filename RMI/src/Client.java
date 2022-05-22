import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[]args)throws RemoteException,NotBoundException{
		Registry r =LocateRegistry.getRegistry("localhost",1999);
		RMI_interface ri = (RMI_interface) r.lookup("ADD");
		System.out.println(ri.add(10,5));
	    System.out.println(ri.sub(10,5));
		System.out.println(ri.Mul(10,5));
		System.out.println(ri.Div(10,5));
	}
}