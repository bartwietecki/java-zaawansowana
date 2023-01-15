package homework.second;

// Klasa bazowa z polami

public abstract class MobileDevice {

    private String displaySize;
    private double ramMemory;
    private String processor;
    private String operatingSystem;
    private String deviceType;

   public MobileDevice(){

   }

    public MobileDevice(String displaySize, double ramMemory, String processor,
                        String operatingSystem, String deviceType) {
        this.displaySize = displaySize;
        this.ramMemory = ramMemory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.deviceType = deviceType;
    }

    public abstract Object showDeviceInfo();

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public double getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "MobileDevice{" +
                "displaySize='" + displaySize +
                ", ramMemory=" + ramMemory +
                ", processor='" + processor +
                ", operatingSystem='" + operatingSystem +
                ", deviceType='" + deviceType +
                '}';
    }
}
