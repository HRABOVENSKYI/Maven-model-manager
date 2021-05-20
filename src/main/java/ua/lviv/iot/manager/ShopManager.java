package ua.lviv.iot.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import ua.lviv.iot.models.loom.Loom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class ShopManager {

    private List<Loom> looms;

    public List<Loom> searchBy(String materialOfTheProducedFabric, int widthOfTheFormedTissue) {
        return looms.stream()
                .filter(loom -> loom.getMaterialOfTheProducedFabric().equals(materialOfTheProducedFabric)
                        && loom.getWidthOfTheFormedTissue() == widthOfTheFormedTissue)
                .collect(Collectors.toList());
    }

    public List<Loom> sortByPrice(SortOrder sortOrder) {
        return getLooms(sortOrder, Comparator.comparing(Loom::getPrice));
    }

    public List<Loom> sortByPowerInWatts(SortOrder sortOrder) {
        return getLooms(sortOrder, Comparator.comparing(Loom::getPowerInWatts));
    }

    private List<Loom> getLooms(SortOrder sortOrder, Comparator<Loom> comparing) {
        if (sortOrder.equals(SortOrder.ASC)) {
            return looms.stream()
                    .sorted(comparing)
                    .collect(Collectors.toList());
        }
        return looms.stream()
                .sorted(comparing.reversed())
                .collect(Collectors.toList());
    }

    public void printAllLooms() {
        looms.forEach(System.out::println);
    }

    public static void printLooms(List<Loom> looms) {
        looms.forEach(System.out::println);
    }
}
