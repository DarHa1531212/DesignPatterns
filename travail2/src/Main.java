import vehicule.FabriqueVehicule;
import vehicule.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicule> mesVehicues = new ArrayList<>();
        FabriqueVehicule fabrique;

        fabrique = new FabriqueAirbus();
        mesVehicues.add(fabrique.createAvion("A380"));
        mesVehicues.add(fabrique.createAvion("A220_300"));

        fabrique = new FabriqueBombardier();
        mesVehicues.add(fabrique.createAvion("CRJ1000"));
        mesVehicues.add(fabrique.createAvion("GLOBAL8000"));
        mesVehicues.add(fabrique.createMotoneige("SKIDOO_EXPEDITION"));
        mesVehicues.add(fabrique.createMotoneige("SKIIDOO_RENEGADE"));

        for (Vehicule vehicule: mesVehicues)
        {
            vehicule.afficherCaracteristiques();
            vehicule.afficherPublicite();
            System.out.println();

        }
    }
}
