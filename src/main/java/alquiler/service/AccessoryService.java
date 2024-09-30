package alquiler.service;

import alquiler.suit.garment.Accessory;

import java.util.ArrayList;
import java.util.List;

public class AccessoryService implements Service<Accessory> {
    private static List<Accessory> accessoryService;
    private static AccessoryService instanciaT;
    private AccessoryService(){
        accessoryService = new ArrayList<>();
    }

    public static AccessoryService getInstancia(){
        if(instanciaT == null){
            instanciaT = new AccessoryService();
        }
        return instanciaT;
    }
    @Override
    public void add(Accessory obj) {
        boolean added = accessoryService.add(obj);
        System.out.println(added ? "Se añadió":"no se añadió");
    }

    @Override
    public Accessory get(int g) {
        return accessoryService.get(g);
    }

    @Override
    public List<Accessory> getAll() {
        return accessoryService;
    }

    @Override
    public Accessory delete(Accessory obj) {
        boolean deleted = accessoryService.remove(obj);
        return deleted?obj:null;
    }

    // Métodos Propios
    // Podemos buscar también por tipo y solo necesitamos uno:
    // siento que esta es una solucion pero no se de mas:
    // Usamos genericos. Stream, referencia a metodos, pero no es muy propio de mi
   /* public <T extends Accessory> T findAccessory(Class<T> type, Color color) {
        return accessoryService.stream()
                .filter(accessory ->
                        type.isInstance(accessory) // Si es accesorio
                        && accessory.getColor().equals(color) // el color
                        && accessory.getState().equals(State.AVAILABLE)) // y si esta dispopnible
                .map(type::cast) // Convierte el accesorio al tipo específico
                .findAny().orElse(null);
    }*/
}
