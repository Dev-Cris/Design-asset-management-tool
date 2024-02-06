package gubodev.digital_asset_manager.enums;

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

    private ProductCategory(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
