package Presentation;

import Domain.Models.Autonomous;
import Domain.Models.Client;
import Domain.Models.Societies;

public class Main {
    public static void main(String[] args) {

//sociedades
        Societies societies = new Societies();
        societies.setIdClient(12312);
        societies.setCorporateName("Supra");
        societies.setPostal("05001");
        societies.setPopulation("Avila");
        societies.setProvince("Avila");
        societies.setEmail("eso123@gmail.com");
        societies.setTelephone("655353445");

        //autonomos
        Autonomous autonomous = new Autonomous();
        autonomous.setIdClient(12312);
        autonomous.setName("");
        autonomous.setSurname("");
        autonomous.setDni("");
        autonomous.setPostal("");
        autonomous.setPopulation("");
        autonomous.setProvince("");
        autonomous.setEmail("");
        autonomous.setTelephone("");

        //cliente autonomos

        // imprimir(Autonomous);
        // imprimir(Societies);


    }
    public static void imprimir(Client client){

        System.out.println("Codigo:" + client.getIdClient() + "");
        //Societies societies = (Societies) client;


    }
}