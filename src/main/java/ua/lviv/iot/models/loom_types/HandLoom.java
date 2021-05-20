package ua.lviv.iot.models.loom_types;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.lviv.iot.models.loom.Country;
import ua.lviv.iot.models.loom.Loom;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class HandLoom extends Loom {

    private int manufactureCentury;
    private Status status;

    public HandLoom(Country originCountry, double price, double powerInWatts, int widthOfTheFormedTissue,
                    String materialOfTheProducedFabric, int manufactureCentury, Status status) {
        super(originCountry, price, powerInWatts, widthOfTheFormedTissue, materialOfTheProducedFabric);
        this.manufactureCentury = manufactureCentury;
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandLoom{" +
                "originCountry=" + originCountry +
                ", price=" + price +
                ", powerInWatts=" + powerInWatts +
                ", widthOfTheFormedTissue=" + widthOfTheFormedTissue +
                ", materialOfTheProducedFabric='" + materialOfTheProducedFabric + '\'' +
                ", manufactureCentury=" + manufactureCentury +
                ", status=" + status +
                '}';
    }
}
