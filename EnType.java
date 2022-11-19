public enum EnType {
    GAS("Gas"),
    ELECTRONIC("Electronic"),
    HYBRID("Hybrid");

    private final String type;

    private EnType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }
};
