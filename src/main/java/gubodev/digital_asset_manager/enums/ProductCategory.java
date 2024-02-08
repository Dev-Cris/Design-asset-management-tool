package gubodev.digital_asset_manager.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductCategory {

    BISCUITS("Biscuits"),
    CANDIES("Candies"),
    CEREALS("Cereals"),
    CHOCOLATES("Chocolates"),
    COFFEES("Coffees"),
    DESSERTS("Desserts"),
    DRINK("Drink"),
    FROZEN_GOODS("Frozen goods"),
    NON_FOODS("Non-foods"),
    SNACKS("Snacks"),
    TEAS("Teas");

    private final String value;
}
