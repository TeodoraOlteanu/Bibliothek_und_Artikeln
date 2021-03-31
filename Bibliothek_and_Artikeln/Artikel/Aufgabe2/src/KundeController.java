import java.util.ArrayList;
import java.util.List;

public class KundeController {

    KundeRepository kundeRepository;

    public KundeController() {
        this.kundeRepository = new KundeRepository();
    }

    public KundeRepository getKundeRepository() {
        return kundeRepository;
    }

    public void setKundeRepository(KundeRepository kundeRepository) {
        this.kundeRepository = kundeRepository;
    }

    public void top() {
        System.out.println("TOP");
    }
}
