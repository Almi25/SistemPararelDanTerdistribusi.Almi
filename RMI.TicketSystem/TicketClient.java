import java.rmi.Naming;

public class TicketClient {
    public static void main(String[] args) {
        try {
            TicketService service = (TicketService) Naming.lookup("rmi://localhost/TicketService");
            String hasil = service.pesanTiket("Almi", "Jakarta - Bandung");
            System.out.println(hasil);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
