import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_server {
	public static void main(String[]args)throws RemoteException,AlreadyBoundException{
	    // TODO Auto-generated method stub
	    RMI_remote re = new RMI_remote();
	    Registry r = LocateRegistry.createRegistry(1999);
	    r.bind("ADD",re);
	    System.out.println("Server Started ....");
	}
}