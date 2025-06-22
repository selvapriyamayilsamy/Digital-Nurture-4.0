public class Main {
    public static void main(String[] args) {
        // 🖥️ Basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println(basicComputer);

        System.out.println("-----");

        // 🖥️ High-end Gaming Computer
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();
        System.out.println(gamingComputer);

        System.out.println("-----");

        // 🖥️ Workstation
        Computer workstation = new Computer.Builder("Intel Xeon", "64GB")
                .setStorage("2TB SSD")
                .setOperatingSystem("Linux")
                .build();
        System.out.println(workstation);
    }
}
