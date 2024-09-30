package alquiler.service;

import alquiler.comp.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientService implements Service<Client>{

    private static ClientService instance;
    private final List<Client> clientList;

    private ClientService (){
        clientList = new ArrayList<>();
    }

    public static ClientService getInstance(){
        if(instance == null){
            instance = new ClientService();
        }
        return instance;
    }

    @Override
    public void add(Client obj) {
        clientList.add(obj);
    }

    @Override
    public Client get(int g) {
        return clientList.get(g);
    }

    @Override
    public List<Client> getAll() {
        return clientList;
    }

    @Override
    public Client delete(Client obj) {
        return (clientList.remove(obj)?obj:null);
    }
    // Aqui tambien debemos buscar al Cliente por ID, pero como no hay una "serializacion" por falta de base de datos, buscaremos nombres:
    public Client findByName(String name){
        return clientList.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst().orElse(null);
    }
}
