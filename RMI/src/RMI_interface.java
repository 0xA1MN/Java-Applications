import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_interface extends Remote{
    public double add(int a,int b)throws RemoteException;
    public double sub(int a,int b)throws RemoteException;
    public double Mul(int a,int b)throws RemoteException;
    public double Div(int a,int b)throws RemoteException;
}