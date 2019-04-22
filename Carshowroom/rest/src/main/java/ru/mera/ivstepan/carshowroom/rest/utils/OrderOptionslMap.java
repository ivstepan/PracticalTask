package ru.mera.ivstepan.carshowroom.rest.utils;

import org.springframework.stereotype.Component;
import ru.mera.ivstepan.carshowroom.rest.model.AutoOptionsDTO;
import ru.mera.ivstepan.carshowroom.rest.entity.Options;

import java.util.HashMap;
import java.util.Map;

@Component
public class OrderOptionslMap {

    public OrderOptionslMap() {
    }

    public Map<String, Boolean> createMapSelectedAutoOptionsDTO(AutoOptionsDTO autoOptionsDTO) {
        Map<String, Boolean> customerSelectedOptions = new HashMap<>();
        customerSelectedOptions.put("heatedWindshieldPrice", autoOptionsDTO.getHeatedWindshieldPrice());
        customerSelectedOptions.put("heatedSeatsPrice", autoOptionsDTO.getHeatedSeatsPrice());
        customerSelectedOptions.put("electricScootersPrice", autoOptionsDTO.getElectricScootersPrice());
        customerSelectedOptions.put("airbagsPrice", autoOptionsDTO.getAirbagsPrice());
        customerSelectedOptions.put("floorMatsPrice", autoOptionsDTO.getFloorMatsPrice());
        customerSelectedOptions.put("winterTiresPrice", autoOptionsDTO.getWinterTiresPrice());
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
