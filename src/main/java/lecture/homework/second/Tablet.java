package lecture.homework.second;

public class Tablet extends MobileDevice{

    private String pencilSupport;

    public Tablet(String pencilSupport) {
        this.pencilSupport = pencilSupport;
    }

    public Tablet(String displaySize, double ramMemory, String processor, String operatingSystem,
                  String deviceType, String pencilSupport) {
        super(displaySize, ramMemory, processor, operatingSystem, deviceType);
        this.pencilSupport = pencilSupport;
    }

    @Override
    public Object showDeviceInfo() {
        return new Tablet.simpleDevice(this);
    }

    @Override
    public String toString() {
        return "Tablet {" +
                ", Display Size: " + super.getDisplaySize() +
                ", RAM: " + super.getRamMemory() +
                ", Processor: " + super.getProcessor() +
                ", Operating System: " + super.getOperatingSystem() +
                ", Device Type: " + super.getDeviceType() +
                "pencilSupport" + pencilSupport +
                "} ";
    }

    static class simpleDevice {
        private String deviceType;
        private String displaySize;
        private double ramMemory;

        public simpleDevice(Tablet tablet) {
            this.deviceType = tablet.getDeviceType();
            this.displaySize = tablet.getDisplaySize();
            this.ramMemory = tablet.getRamMemory();
        }

        @Override
        public String toString() {
            return "simpleDevice{" +
                    "deviceType='" + deviceType +
                    ", displaySize='" + displaySize +
                    ", ramMemory=" + ramMemory +
                    '}';
        }
    }
}
