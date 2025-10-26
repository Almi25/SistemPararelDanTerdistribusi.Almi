import java.rmi.Naming;

public class TicketServer {
    public static void main(String[] args) {
        try {
            TicketService service = new TicketServiceImpl();
            Naming.rebind("rmi://localhost/TicketService", service);
            System.out.println("Server siap melayani pemesanan tiket...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}