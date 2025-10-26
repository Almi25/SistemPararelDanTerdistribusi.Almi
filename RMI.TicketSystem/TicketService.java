import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TicketService extends Remote {
    String pesanTiket(String nama, String tujuan) throws RemoteException;
}
