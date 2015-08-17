import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by yulin on 8/16/15.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey";
    }
}
