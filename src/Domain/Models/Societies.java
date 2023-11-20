package Domain.Models;

public class Societies {

    public Integer idClient;
    public String CorporateName;
    public String cif;
    public String postal;
    public String population;
    public String province;
    public String email;
    public String telephone;


    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public String getCorporateName() {
        return CorporateName;
    }

    public String getCif() {
        return cif;
    }

    public String getPostal() {
        return postal;
    }

    public String getPopulation() {
        return population;
    }

    public String getProvince() {
        return province;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
