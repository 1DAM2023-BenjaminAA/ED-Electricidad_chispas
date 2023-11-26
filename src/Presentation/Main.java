package Presentation;

import Domain.Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//sociedades
        Societies societies = new Societies();
        societies.setIdClient(1);
        societies.setCorporateName(" SupraExt ");
        societies.setPostal(" 05115 ");
        societies.setPopulation(" Avila ");
        societies.setProvince(" Avila ");
        societies.setEmail(" robertpGomez1@gmail.com ");
        societies.setTelephone(" 655353445 ");

        //autonomos
        Autonomous autonomous = new Autonomous();
        autonomous.setIdClient(1);
        autonomous.setName(" Roberto ");
        autonomous.setSurname(" Gomez Rafiño ");
        autonomous.setDni(" 12414234Q ");
        autonomous.setPostal(" 05115 ");
        autonomous.setPopulation(" Avila ");
        autonomous.setProvince(" Avila ");
        autonomous.setEmail(" robertoGomes1@gmail.com ");
        autonomous.setTelephone(" 655353445 ");


        ArrayList<Product>products = new ArrayList<>();
        Product product1 = new Product();
        product1.setIdProduct(1);
        product1.setName("Product n1 ");
        product1.setBranding(" Asus ");
        product1.setModel(" Brodgec ");
        product1.setPrice(" 200€ ");
        product1.setVatRate(" 21% ");



        Product product2 = new Product();
        product2.setIdProduct(2);
        product2.setName(" Producto n2 ");
        product2.setBranding(" Aorus ");
        product2.setModel(" Malta ");
        product2.setPrice(" 150€ ");
        product2.setVatRate("21% ");


        ArrayList<Services>services = new ArrayList<>();
        Services services1 = new Services();
        services1.setIdProduct(11);
        services1.setName(" Mantenimiento ");
        services1.setPrice(" 30€ ");
        services1.setHoursWorked(" 2 ");


        Services services2 = new Services();
        services2.setIdProduct(12);
        services2.setName(" Reparacion ");
        services2.setPrice(" 50€ ");
        services2.setHoursWorked(" 3 ");



        Bills bills1 = new Bills();
        bills1.setIdInvoice(2111);
        bills1.setDate(" 26/11/2023 ");
        bills1.setTaxBase(" 230€ ");
        bills1.setTotalVat(" 278,3€ ");
        bills1.setClient(autonomous);
        bills1.addSale(product1);
        bills1.addSale(services1);

        Bills bills2 =new Bills();
        bills2.setIdInvoice(2112);
        bills2.setDate(" 26/11/2023 ");
        bills2.setTaxBase(" 200€ ");
        bills2.setTotalVat(" 242€ ");
        bills2.setClient(societies);
        bills2.addSale(product2);
        bills2.addSale(services2);





        imprimirFacturas(bills1);
        imprimirFacturas(bills2);

        // imprimir(Autonomous);
        // imprimir(Societies);


    }

    public static void imprimirFacturas(Bills bills){

        System.out.println("Código: " + bills.getIdInvoice() + "Fecha: " + bills.getDate() );
        System.out.println("Cliente: " + bills.getClient().getIdClient()
                + "     Nombre" + bills.getClient().getName()
                + "    Direccion: " + bills.getClient().getPostal()
                + "    Poblacion  " + bills.getClient().getProvince()) ;

        for(Sale sale : bills.getSaleList()){

            System.out.println("Codigo  " + sale.getIdProduct()
                + "     Nombre   " + sale.getName()
                + "     Tipo Iva:   " + sale.getVatRate());

        }

    }
}