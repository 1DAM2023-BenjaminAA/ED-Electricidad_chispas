package Domain.Models;

public class Societies extends Client{

    public String CorporateName;
    public String cif;


    public String getCorporateName() {
        return CorporateName;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
