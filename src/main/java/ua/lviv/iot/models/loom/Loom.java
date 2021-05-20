package ua.lviv.iot.models.loom;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Loom {

    protected Country originCountry;
    protected double price;
    protected double powerInWatts;
    protected int widthOfTheFormedTissue;
    protected String materialOfTheProducedFabric;

    protected Loom(Country originCountry, double price, double powerInWatts, int widthOfTheFormedTissue,
                String materialOfTheProducedFabric) {
        this.originCountry = originCountry;
        this.price = price;
        this.powerInWatts = powerInWatts;
        this.widthOfTheFormedTissue = widthOfTheFormedTissue;
        this.materialOfTheProducedFabric = materialOfTheProducedFabric;
    }
}
