package Domain.Models;

public class Autonomous {
    public Integer idClient;
    public String name;
    public String surname;
    public String dni;
    public String postal;
    public String population;
    public String province;
    public String email;
    public String telephone;


    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
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
