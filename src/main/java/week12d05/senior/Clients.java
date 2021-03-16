package week12d05.senior;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Clients {

    private List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return new ArrayList<>(clients);
    }

    public Client findByRegNumber(String str) {
        Client found = null;
        for (Client item : clients) {
            if (item.getRegNumber().equals(str)) {
                item = found;
            }
            return found;
        }
        throw new IllegalArgumentException("No result");
    }

    public List<Client> findByName(String name) {
        clients = new LinkedList<>();
        List<Client> found = new ArrayList<>();
        for (Client item : clients) {
            if (item.getName().contains(name)) {
                found.add(item);
            }

        }
        return found;

    }
}

