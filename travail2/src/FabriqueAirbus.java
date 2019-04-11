import vehicule.Avion;
import vehicule.FabriqueVehicule;
import vehicule.Motoneige;
import vehicule.airbus.avion.A220_300;
import vehicule.airbus.avion.A380;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

public class FabriqueAirbus implements FabriqueVehicule {
    @Override
    public Motoneige createMotoneige(String modele) {
    return null;
    }

    @Override
    public Avion createAvion(String model) {
        if (model == "A220_300")
        {
            return new A220_300();
        }
        else
        {
            return new A380();
        }
    }
}
