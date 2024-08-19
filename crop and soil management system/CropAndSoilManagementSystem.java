import java.util.Scanner;

public class CropAndSoilManagementSystem {
    public static void cropSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Soil Type (sandy, loamy, clay): ");
        String soilType = scanner.nextLine();
        System.out.print("Enter Climate (tropical, temperate): ");
        String climate = scanner.nextLine();
        System.out.print("Enter Season (summer, winter): ");
        String season = scanner.nextLine();

        if (soilType.equalsIgnoreCase("loamy") && climate.equalsIgnoreCase("tropical") && season.equalsIgnoreCase("summer")) {
            System.out.println("Suggested Crops: Rice, Sugarcane, Maize");
        } else if (soilType.equalsIgnoreCase("sandy") && climate.equalsIgnoreCase("temperate") && season.equalsIgnoreCase("winter")) {
            System.out.println("Suggested Crops: Wheat, Barley, Potatoes");
        } else {
            System.out.println("No specific crop suggestions available for the given conditions.");
        }
    }

    public static void soilManagement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Soil pH: ");
        double pH = scanner.nextDouble();
        System.out.print("Enter Soil Moisture (%): ");
        double moisture = scanner.nextDouble();

        if (pH < 5.5) {
            System.out.println("Soil is acidic. Add lime to increase pH.");
        } else if (pH > 7.5) {
            System.out.println("Soil is alkaline. Add sulfur to decrease pH.");
        } else {
            System.out.println("Soil pH is optimal.");
        }
        
        if (moisture < 30) {
            System.out.println("Soil moisture is low. Consider irrigation.");
        } else if (moisture > 70) {
            System.out.println("Soil moisture is high. Consider drainage.");
        } else {
            System.out.println("Soil moisture is optimal.");
        }
    }
    public static void diseaseIdentification() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Crop Type: ");
        String cropType = scanner.nextLine();
        System.out.print("Enter Symptom (e.g., blight, brown spots): ");
        String symptom = scanner.nextLine();

        if (cropType.equalsIgnoreCase("wheat") && symptom.equalsIgnoreCase("blight")) {
            System.out.println("Possible Disease: Wheat Blight. Use fungicides like Mancozeb.");
        } else if (cropType.equalsIgnoreCase("rice") && symptom.equalsIgnoreCase("brown spots")) {
            System.out.println("Possible Disease: Brown Spot in Rice. Ensure proper water management.");
        } else {
            System.out.println("No specific disease identified for the given symptoms.");
        }
    }

    public static void nutrientManagement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Crop Type: ");
        String cropType = scanner.nextLine();
        System.out.print("Enter Nitrogen Level: ");
        double nitrogen = scanner.nextDouble();
        System.out.print("Enter Phosphorus Level: ");
        double phosphorus = scanner.nextDouble();
        System.out.print("Enter Potassium Level: ");
        double potassium = scanner.nextDouble();

        System.out.println("Nutrient Management for " + cropType + ":");
        if (nitrogen < 50) {
            System.out.println("Low nitrogen. Apply nitrogen-rich fertilizers.");
        }
        if (phosphorus < 30) {
            System.out.println("Low phosphorus. Apply phosphorus-rich fertilizers.");
        }
        if (potassium < 40) {
            System.out.println("Low potassium. Apply potassium-rich fertilizers.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Crop and Soil Management System");
            System.out.println("1. Crop Selection");
            System.out.println("2. Soil Management");
            System.out.println("3. Disease Identification");
            System.out.println("4. Nutrient Management");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    cropSelection();
                    break;
                case 2:
                    soilManagement();
                    break;
                case 3:
                    diseaseIdentification();
                    break;
                case 4:
                    nutrientManagement();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
