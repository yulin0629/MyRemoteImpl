import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yulin on 8/16/15.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
