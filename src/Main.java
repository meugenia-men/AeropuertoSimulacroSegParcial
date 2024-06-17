import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, CustomException {

        Contenedora contenedora = new Contenedora();

        contenedora.listaAeropuertosMayorCapacidad(30);

        contenedora.showList();

        System.out.println("::::::::: AEROPUERTOS DE MAYOR CAPACIDAD :::::::::");
        contenedora.getAeropuertosMayorCapacidad().forEach(System.out::println);

    }
}