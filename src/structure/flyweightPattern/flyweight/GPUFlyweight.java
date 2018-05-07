package structure.flyweightPattern.flyweight;

public class GPUFlyweight implements ComputerFlyweight {

    public static final String MODEL_NVIDIA_TITAN_V = "NVIDIA TITAN V";
    public static final String MODEL_AMD_RX_VEGA = "AMD RX Vega";
    public static final String VERSION_REFERENCE_DESIGN = "reference design";
    public static final String VERSION_NON_REFERENCE_DESIGN = "non reference design";
    private final String model;
    private final String version;

    GPUFlyweight(String model, String version) {
        this.model = model;
        this.version = version;
    }

    @Override
    public boolean match(String model, String version) {
        return this.model.equals(model) && this.version.equals(version);
    }

    @Override
    public void add(ComputerFlyweight flyweight) {
        throw new UnsupportedOperationException("GPUFlyweight对象不允许包含子元素");
    }

}
