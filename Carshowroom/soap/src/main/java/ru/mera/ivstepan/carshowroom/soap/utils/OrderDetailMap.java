package ru.mera.ivstepan.carshowroom.soap.utils;

import org.springframework.stereotype.Component;
import ru.mera.ivstepan.carshowroom.soap.entity.Options;
import ru.mera.ivstepan.carshowroom.soap.model.AutoOptionsElement;

import java.util.HashMap;
import java.util.Map;

@Component
public class OrderDetailMap {

    public OrderDetailMap() {
    }

    public Map<String, Boolean> createMapSelectedAutoOptions(AutoOptionsElement autoOptionsElement) {
        Map<String, Boolean> customerSelectedOptions = new HashMap<>();
        customerSelectedOptions.put("heatedWindshieldPrice", autoOptionsElement.isHeatedWindshieldPrice());
        customerSelectedOptions.put("heatedSeatsPrice", autoOptionsElement.isHeatedSeatsPrice());
        customerSelectedOptions.put("electricScootersPrice", autoOptionsElement.isElectricScootersPrice());
        customerSelectedOptions.put("airbagsPrice", autoOptionsElement.isAirbagsPrice());
        customerSelectedOptions.put("floorMatsPrice", autoOptionsElement.isFloorMatsPrice());
        customerSelectedOptions.put("winterTiresPrice", autoOptionsElement.isWinterTiresPrice());
        return customerSelectedOptions;
    }

    public Map<String, Integer> createMapOptionsPrice(Options options) {
        Map<String, Integer> priceOptions = new HashMap<>();
        priceOptions.put("autoPrice", options.getAutoPrice());
        priceOptions.put("heatedWindshieldPrice", options.getHeatedWindshieldPrice());
        priceOptions.put("heatedSeatsPrice", options.getHeatedSeatsPrice());
        priceOptions.put("electricScootersPrice", options.getElectricScootersPrice());
        priceOptions.put("airbagsPrice", options.getAirbagsPrice());
        priceOptions.put("floorMatsPrice", options.getFloorMatsPrice());
        priceOptions.put("winterTiresPrice", options.getWinterTiresPrice());
        return priceOptions;
    }
}
