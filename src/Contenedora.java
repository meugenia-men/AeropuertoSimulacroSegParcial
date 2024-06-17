import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Contenedora {
    private Aeropuerto[] aeropuertos = fromJsontoArray();
    private List<Aeropuerto> aeropuertosMayorCapacidad =new ArrayList<>();

    public Contenedora() throws CustomException {
    }

    public Contenedora(Aeropuerto[] aeropuertos) throws CustomException {
        this.aeropuertos = aeropuertos;
    }

    public Aeropuerto[] getAeropuertos() {
        return aeropuertos;
    }

    public void setAeropuertos(Aeropuerto[] aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    public List<Aeropuerto> getAeropuertosMayorCapacidad() {
        return aeropuertosMayorCapacidad;
    }

    public void setAeropuertosMayorCapacidad(List<Aeropuerto> aeropuertosMayorCapacidad) {
        this.aeropuertosMayorCapacidad = aeropuertosMayorCapacidad;
    }

    public Aeropuerto[] fromJsontoArray() {
        try {
            File fileJson = new File("C:\\Users\\mariu\\IdeaProjects\\AeropuertosParcial\\archivo.json");

            ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.readValue(fileJson, Aeropuerto[].class);

        } catch (ClassCastException e) {
            e.getStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void showList() {
        for (Aeropuerto a : aeropuertos) {
            System.out.println(a);
        }
    }

    public void listaAeropuertosMayorCapacidad(Integer capacity) throws CustomException {
        try {
            for (Aeropuerto a : this.aeropuertos) {
                if (a.getCapacidad() > capacity) {
                   this.aeropuertosMayorCapacidad.add(a);
                }
            }
            if (aeropuertosMayorCapacidad.isEmpty()) {
                throw new CustomException(capacity);
            }
        } catch (CustomException | NullPointerException e) {
            e.getStackTrace();
        }
    }
}