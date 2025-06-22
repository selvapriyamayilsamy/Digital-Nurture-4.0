public class Computer {
    // Required attributes
    private String cpu;
    private String ram;

    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // ✅ Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // ✅ Static nested Builder class
    public static class Builder {
        // Required
        private String cpu;
        private String ram;

        // Optional
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "💻 Computer Config:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + (storage != null ? storage : "Not Included") + "\n" +
                "Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not Included") + "\n" +
                "Operating System: " + (operatingSystem != null ? operatingSystem : "Not Installed");
    }
}