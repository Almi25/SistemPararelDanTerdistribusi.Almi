import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class TicketServiceImpl extends UnicastRemoteObject implements TicketService {
    protected TicketServiceImpl() throws RemoteException {
        super();
    }

    public String pesanTiket(String nama, String tujuan) throws RemoteException {
        return "Tiket atas nama " + nama + " untuk tujuan " + tujuan + " berhasil dipesan.";
    }
}