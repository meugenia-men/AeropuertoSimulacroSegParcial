import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, CustomException {

        Contenedora contenedora = new Contenedora();
        List<String> tagsList= new ArrayList<>();
        Integer opc;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("[1] Inciso 1");
            System.out.println("[2] Inciso 2");
            System.out.println("[3] Inciso 3");
            System.out.println("[4] Inciso 4");
            System.out.println("[0] Salir");
            System.out.println("\n Opcion = ....");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    contenedora.showListAeropuertos();
                    sc.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
                case 2:
                    contenedora.listaAeropuertosMayorCapacidad(30);
                    System.out.println("::::::::::::::::::: AEROPUERTOS DE MAYOR CAPACIDAD :::::::::::::::::::::::");
                    contenedora.getAeropuertosMayorCapacidad().forEach(System.out::println);
                    sc.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
                case 3:
                    GenericClass<String> genericClassTags = new GenericClass<>();

                    for (Aeropuerto a : contenedora.getAeropuertos()) {
                        if (!a.getEtiquetas().isEmpty()) {
                            for (String etiqueta : a.getEtiquetas()) {
                                genericClassTags.addElement(etiqueta);
                            }
                        }
                    }
                    System.out.println("::::::::::::::::::::::: Lista de tags :::::::::::::::::::::::::::");
                    tagsList = genericClassTags.getList();
                    genericClassTags.getList().forEach(System.out::println);

                    GenericClass<String> genericClassPilots = new GenericClass<>();

                    for (Aeropuerto a : contenedora.getAeropuertos()) {
                        if (!a.getAviones().isEmpty()) {
                            for (Avion avion : a.getAviones()) {
                                genericClassPilots.addElement(avion.getPiloto());
                            }
                        }
                    }
                    System.out.println("\n\n\n");
                    System.out.println("::::::::::::::::::::::: Lista de Pilotos :::::::::::::::::::::::::::");
                    genericClassPilots.getList().forEach(System.out::println);
                    sc.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
                case 4:
                    Set<String> setTags = new HashSet<>();

                    for (String etiqueta : tagsList) {
                        setTags.add(etiqueta);
                    }

                    System.out.println(":::::::::::::::::::::::: Set de tags ::::::::::::::::::::::::::::::::");
                    for (String etiqueta : setTags) {
                        System.out.println(etiqueta);
                    }
                    sc.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(opc!=0);

    }
}