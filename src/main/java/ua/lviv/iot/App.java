package ua.lviv.iot;

import ua.lviv.iot.manager.ShopManager;
import ua.lviv.iot.manager.SortOrder;
import ua.lviv.iot.models.loom.Country;
import ua.lviv.iot.models.loom.Loom;
import ua.lviv.iot.models.loom_types.HandLoom;
import ua.lviv.iot.models.loom_types.MechanicalLoom;
import ua.lviv.iot.models.loom_types.Shape;
import ua.lviv.iot.models.loom_types.Status;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Loom> listOfLooms = List.of(
                new HandLoom(Country.UKRAINE, 18000, 0, 1, "Cotton", 19, Status.FUNCTIONAL),
                new MechanicalLoom(Country.CHINA, 4500, 120, 2, "Silk", Shape.FLAT),
                new MechanicalLoom(Country.USA, 12500, 850, 6, "Wool", Shape.CIRCULAR),
                new MechanicalLoom(Country.GERMANY, 14999, 1200, 8, "Wool", Shape.SQUARE),
                new MechanicalLoom(Country.USA, 9999, 750, 5, "Silk", Shape.CIRCULAR),
                new MechanicalLoom(Country.CHINA, 4699, 165, 6, "Wool", Shape.FLAT),
                new HandLoom(Country.UKRAINE, 21000, 0, 6, "Wool", 19, Status.INEFFECTIVE)
        );

        System.out.println("\n\n***Object of a ShopManager created***\n");
        ShopManager shopManager = new ShopManager(listOfLooms);

        System.out.println("\n\n***Print all looms***\n");
        shopManager.printAllLooms();

        System.out.println("\n\n***Find all looms with materialOfTheProducedFabric=\"Wool\" and" +
                " widthOfTheFormedTissue=6***\n");
        ShopManager.printLooms(shopManager.searchBy("Wool", 6));

        System.out.println("\n\n***Sort looms by price in ascending order***\n");
        ShopManager.printLooms(shopManager.sortByPrice(SortOrder.ASC));

        System.out.println("\n\n***Sort looms by price in descending order***\n");
        ShopManager.printLooms(shopManager.sortByPrice(SortOrder.DESC));

        System.out.println("\n\n***Sort looms by powerInWatts in ascending order***\n");
        ShopManager.printLooms(shopManager.sortByPowerInWatts(SortOrder.ASC));

        System.out.println("\n\n***Sort looms by powerInWatts in descending order***\n");
        ShopManager.printLooms(shopManager.sortByPowerInWatts(SortOrder.DESC));
    }
}
