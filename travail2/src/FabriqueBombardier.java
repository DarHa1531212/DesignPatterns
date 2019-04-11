import vehicule.Avion;
import vehicule.FabriqueVehicule;
import vehicule.Motoneige;
import vehicule.bombardier.avion.CRJ100;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

public class FabriqueBombardier implements FabriqueVehicule {
    @Override
    public Motoneige createMotoneige(String modele) {
        if (modele == "SkiDooExpeditionSport") {

            return new SkiDooExpeditionSport();
        }
        else {
            return new SkiDooRenegade();
        }
    }

    @Override
    public Avion createAvion(String model) {
        if (model == "CRJ1000") {
            return new CRJ100();
        }
        else
        {
            return new Global8000();
        }
    }
}
