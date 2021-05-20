package ua.lviv.iot.models.loom_types;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.lviv.iot.models.loom.Country;
import ua.lviv.iot.models.loom.Loom;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MechanicalLoom extends Loom {

    private Shape construction;

    public MechanicalLoom(Country originCountry, double price, double powerInWatts, int widthOfTheFormedTissue,
                          String materialOfTheProducedFabric, Shape construction) {
        super(originCountry, price, powerInWatts, widthOfTheFormedTissue, materialOfTheProducedFabric);
        this.construction = construction;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "originCountry=" + originCountry +
                ", price=" + price +
                ", powerInWatts=" + powerInWatts +
                ", widthOfTheFormedTissue=" + widthOfTheFormedTissue +
                ", materialOfTheProducedFabric='" + materialOfTheProducedFabric + '\'' +
                ", construction=" + construction +
                '}';
    }
}
