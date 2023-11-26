package Domain.Models;

import java.util.ArrayList;

public class Bills {

    public Integer idInvoice;
    public String date;
    public Client client;
  //  public ArrayList<Product> productsImp;
    // public ArrayList<Services>servicesImp;

    private ArrayList<Sale>saleList = new ArrayList<>();
    public String taxBase;
    public String totalVat;



    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }




    public String getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    public String getTotalVat() {
        return totalVat;
    }

    public void setTotalVat(String totalVat) {
        this.totalVat = totalVat;
    }

    public ArrayList<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(ArrayList<Sale> saleList) {
        this.saleList = saleList;
    }

    public void addSale(Sale sale){
        saleList.add(sale);
    }

    public Sale getSale(Integer posicion){

        return saleList.get(posicion);
    }

    //  public ArrayList<Product> getProductsImp() {
       // return productsImp;
   // }

    // public void setProductsImp(ArrayList<Product> productsImp) {
     //   this.productsImp = productsImp;
 //   }

    //public ArrayList<Services> getServicesImp() {
    //    return servicesImp;
  //  }

   // public void setServicesImp(ArrayList<Services> servicesImp) {
      //  this.servicesImp = servicesImp;
   // }


}
