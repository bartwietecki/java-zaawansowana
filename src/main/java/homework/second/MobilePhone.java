package homework.second;

public class MobilePhone extends MobileDevice {


//    public MobilePhone() {
//
//    }
//
//    public static void main(String[] args) {
//        MobilePhone mobilePhone = new MobilePhone();
//        mobilePhone.showDeviceInfo();
//    }

    private String lteSupport;

    public MobilePhone(String lteSupport) {
        this.lteSupport = lteSupport;
    }

    public MobilePhone(String displaySize, double ramMemory, String processor,
                       String operatingSystem, String deviceType, String lteSupport) {
        super(displaySize, ramMemory, processor, operatingSystem, deviceType);
        this.lteSupport = lteSupport;
    }

    @Override
    public Object showDeviceInfo() {
        return new simpleDevice(this);
    }

    @Override
    public String toString() {
        return "MobilePhone {" +
                ", Display Size: " + super.getDisplaySize() +
                ", RAM: " + super.getRamMemory() +
                ", Processor: " + super.getProcessor() +
                ", Operating System: " + super.getOperatingSystem() +
                ", Device Type: " + super.getDeviceType() +
                ", LTE Support: " + lteSupport +
                "} ";
    }

    static class simpleDevice {
        private String deviceType;
        private String displaySize;
        private double ramMemory;

        public simpleDevice(MobileDevice mobilePhone) {
            this.deviceType = mobilePhone.getDeviceType();
            this.displaySize = mobilePhone.getDisplaySize();
            this.ramMemory = mobilePhone.getRamMemory();
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
