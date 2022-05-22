import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMI_remote extends UnicastRemoteObject implements RMI_interface{
    protected RMI_remote()throws RemoteException{
        super();
        // TODO Auto-generated constructor stub
   }
    @Override
    public double add(int a,int b)throws RemoteException{
        // TODO Auto-generated method stub
        return a+b;
   }
    @Override
    public double sub(int a,int b)throws RemoteException{
        // TODO Auto-generated method stub
        return a-b;
   }
    @Override
    public double Mul(int a,int b)throws RemoteException{
        // TODO Auto-generated method stub
        return a*b;
   }
    @Override
    public double Div(int a,int b)throws RemoteException{
        // TODO Auto-generated method stub
        return a/b;
   }
}