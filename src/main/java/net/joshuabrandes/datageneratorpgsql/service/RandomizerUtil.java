package net.joshuabrandes.datageneratorpgsql.service;

import net.joshuabrandes.datageneratorpgsql.model.entity.Item;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

/**
 * Utility class for generating random data based on predefined lists of categories, names, and statuses.
 * This class provides static final lists of predefined data for various categories like books, electronics,
 * and clothing. It serves as a repository of sample data that can be used for testing, simulations, or
 * other purposes requiring random data.
 * <p>
 * This class is not intended to be instantiated, and all members are static and final.
 * <p>
 * Categories of data covered:
 * - Product categories (e.g., Books, Electronics, Clothing)
 * - Product names for specific categories
 * - Company names for specific industries
 * - Product statuses like availability or order conditions
 * <p>
 * The lists of examples where Created with ChatGPT:
 */
public class RandomizerUtil {

    static final Random random = new Random();

    static final List<String> statuses = List.of("Available", "Out of Stock", "Discontinued", "Preorder", "Backorder");

    /*
    === Categories ===
     */
    static final List<String> categories = List.of(
            "Books", "Electronics", "Clothing", "Home", "Sports", "Beauty",
            "Toys", "Automotive", "Grocery", "Health", "Jewelry", "Garden"
    );

    // Books
    static final List<String> namesBooks = List.of(
            "The Hobbit", "The Hunger Games", "The Lord of the Rings",
            "The Hitchhiker's Guide to the Galaxy", "The Adventures of Huckleberry Finn",
            "The Da Vinci Code", "The Catcher in the Rye", "To Kill a Mockingbird",
            "Pride and Prejudice", "1984", "Moby Dick", "Great Expectations",
            "Little Women", "War and Peace", "Crime and Punishment",
            "The Great Gatsby", "Brave New World", "Jane Eyre",
            "Wuthering Heights", "Frankenstein", "Dracula"
    );

    // Electronics
    static final List<String> electronicsCompanies = List.of(
            "TechNova", "GizmoWorks", "Electronixia", "ByteWave", "CircuitHub",
            "PixelPulse", "QuantumGear", "NanoSphere", "VoltEdge"
    );
    static final List<String> namesElectronics = List.of(
            "Smartphone", "Laptop", "Tablet", "Smartwatch", "Bluetooth Speaker",
            "Wireless Earbuds", "Gaming Console", "External Hard Drive",
            "Monitor", "Keyboard", "Mouse", "Webcam", "Drone",
            "VR Headset", "Fitness Tracker", "Smart Home Hub",
            "E-Reader", "Portable Charger", "Soundbar", "Action Camera"
    );

    // Clothing
    static final List<String> clothingCompanies = List.of(
            "ThreadVibe", "StyleSphere", "FabricFusion", "ModaMingle", "TrendTide",
            "ChicCraze", "UrbanWeave", "EleganceEdge", "VogueVista"
    );
    static final List<String> namesClothing = List.of(
            "T-Shirt", "Jeans", "Jacket", "Sweater", "Dress",
            "Skirt", "Shorts", "Hoodie", "Blouse", "Coat",
            "Leggings", "Cardigan", "Polo Shirt", "Tank Top", "Blazer",
            "Raincoat", "Sweatpants", "Bomber Jacket", "Camisole", "Overalls"
    );

    /*
    === Home ===
     */
    static final List<String> homeCompanies = List.of(
            "CasaCraft", "HomeHaven", "NestNook", "ComfortCore", "AbodeArtisans",
            "LivingLeaf", "DwellingDreams", "HearthHarmony", "SanctuaryStyles"
    );
    static final List<String> namesHome = List.of(
            "Sofa", "Dining Table", "Chair", "Lamp", "Curtains", "Rug", "Coffee Table", "Bookshelf",
            "Bed Frame", "Mattress", "Desk", "Dresser", "Nightstand", "Cabinet", "Mirror",
            "Picture Frame", "Vase", "Candle Holder", "Throw Pillow", "Blinds"
    );

    /*
    === Sports ===
     */
    static final List<String> sportsCompanies = List.of(
            "PeakPerformance", "AthletiCore", "SportSphere", "VictoryVault", "EnduraEquip",
            "FlexForce", "MomentumGear", "ChampionChase", "ActiveAim"
    );
    static final List<String> namesSports = List.of(
            "Football", "Basketball", "Tennis Racket", "Soccer Ball", "Baseball Glove",
            "Running Shoes", "Yoga Mat", "Cycling Helmet", "Golf Clubs", "Swimming Goggles",
            "Hockey Stick", "Skateboard", "Dumbbells", "Resistance Bands", "Fitness Tracker",
            "Sports Jersey", "Ski Goggles", "Camping Tent", "Fishing Rod", "Boxing Gloves"
    );

    /*
    === Beauty ===
     */
    static final List<String> beautyCompanies = List.of(
            "GlamourGlow", "BeautyBurst", "RadiantRituals", "EleganceEssence", "LuxeLush",
            "CharmChic", "PurePout", "SilkSensation", "VelvetVibe"
    );
    static final List<String> namesBeauty = List.of(
            "Lipstick", "Foundation", "Mascara", "Eyeliner", "Blush",
            "Perfume", "Nail Polish", "Hair Serum", "Moisturizer", "Face Cream",
            "Sunscreen", "Hair Gel", "Body Lotion", "Makeup Brushes", "Eyeshadow Palette",
            "Hair Dryer", "Shampoo", "Conditioner", "Hair Straightener", "Exfoliator"
    );

    /*
    === Toys ===
     */
    static final List<String> toysCompanies = List.of(
            "PlayPalace", "FunForge", "ToyTrove", "WonderWorks", "HappyHaven",
            "KiddoKingdom", "ImagineInn", "GiggleGear", "MagicMeadow"
    );
    static final List<String> namesToys = List.of(
            "Action Figure", "Puzzle", "Board Game", "Doll", "Remote Control Car",
            "Building Blocks", "Stuffed Animal", "Yo-Yo", "Toy Train", "RC Drone",
            "Lego Set", "Playset", "Plush Toy", "Educational Kit", "Video Game Console",
            "Kite", "Bicycle", "Scooter", "Teddy Bear", "Toy Robot"
    );

    /*
    === Automotive ===
     */
    static final List<String> automotiveCompanies = List.of(
            "MotorMinds", "AutoAlchemy", "DriveDynamics", "GearGrove", "TurboTrail",
            "VelocityVenture", "RoadRover", "SteerStream", "PistonPeak"
    );
    static final List<String> namesAutomotive = List.of(
            "Sedan", "SUV", "Truck", "Coupe", "Hatchback", "Convertible",
            "Minivan", "Pickup", "Motorcycle", "Electric Car",
            "Hybrid Vehicle", "Diesel Truck", "Sports Car", "Off-Road Vehicle", "Luxury Sedan",
            "Crossover", "Van", "Roadster", "Station Wagon", "Compact Car"
    );

    /*
    === Grocery ===
     */
    static final List<String> namesGrocery = List.of(
            "Milk", "Bread", "Eggs", "Cheese", "Butter",
            "Apples", "Bananas", "Oranges", "Tomatoes", "Lettuce",
            "Chicken Breast", "Ground Beef", "Pasta", "Rice", "Cereal",
            "Yogurt", "Juice", "Canned Beans", "Frozen Vegetables", "Olive Oil"
    );

    /*
    === Health ===
     */
    static final List<String> healthCompanies = List.of(
            "WellWave", "HealthHorizon", "VitalVista", "CareCascade", "MediMingle",
            "PurePulse", "LifeLoom", "HealHive", "OptimaOrg"
    );
    static final List<String> namesHealth = List.of(
            "Vitamins", "Pain Reliever", "Cough Syrup", "Antibiotic", "First Aid Kit",
            "Thermometer", "Bandages", "Hand Sanitizer", "Face Masks", "Allergy Medicine",
            "Multivitamins", "Cold Medicine", "Wound Care", "Digestive Health", "Sleep Aid",
            "Energy Supplements", "Blood Pressure Monitor", "Insulin", "Glucose Meter", "Protein Powder"
    );

    /*
    === Jewelry ===
     */
    static final List<String> namesJewelry = List.of(
            "Necklace", "Earrings", "Bracelet", "Ring", "Watch",
            "Anklet", "Brooch", "Pendant", "Cufflinks", "Tiara",
            "Charm", "Bangle", "Chain", "Studs", "Hoop Earrings",
            "Locket", "Gemstone Ring", "Pearl Necklace", "Beaded Bracelet", "Statement Earrings"
    );

    /*
    === Garden ===
     */
    static final List<String> gardenCompanies = List.of(
            "GreenGrowers", "GardenGlade", "FloraFusion", "PlantPioneers", "BloomBarn",
            "LeafLounge", "SproutSphere", "HerbHaven", "PetalPros"
    );
    static final List<String> namesGarden = List.of(
            "Lawn Mower", "Garden Hose", "Shovel", "Rake", "Pruning Shears",
            "Garden Fork", "Wheelbarrow", "Plant Pots", "Garden Gloves", "Watering Can",
            "Garden Tractor", "Hedge Trimmer", "Sprinkler", "Garden Shears",
            "Compost Bin", "Garden Seeds", "Potting Soil", "Garden Lanterns", "Bird Feeder"
    );


    public static Item getRandomItem() {
        var category = getRandomFromList(categories);

        var name = switch (category) {
            case "Books" -> getRandomFromList(namesBooks);
            case "Electronics" -> getRandomFromLists(electronicsCompanies, namesElectronics);
            case "Home" -> getRandomFromLists(homeCompanies, namesHome);
            case "Clothing" -> getRandomFromLists(clothingCompanies, namesClothing);
            case "Sports" -> getRandomFromLists(sportsCompanies, namesSports);
            case "Beauty" -> getRandomFromLists(beautyCompanies, namesBeauty);
            case "Toys" -> getRandomFromLists(toysCompanies, namesToys);
            case "Automotive" -> getRandomFromLists(automotiveCompanies, namesAutomotive);
            case "Grocery" -> getRandomFromList(namesGrocery);
            case "Health" -> getRandomFromLists(healthCompanies, namesHealth);
            case "Jewelry" -> getRandomFromList(namesJewelry);
            case "Garden" -> getRandomFromLists(gardenCompanies, namesGarden);
            default -> throw new IllegalArgumentException("Invalid category: " + category);
        };

        var price = random.nextDouble() * 1000;
        var status = getRandomFromList(statuses);
        var dateCreated = getRandomDate();

        return new Item(name, category, dateCreated, price, status);
    }

    private static String getRandomFromList(List<String> data) {
        return data.get(random.nextInt(data.size()));
    }

    private static String getRandomFromLists(List<String> data1, List<String> data2) {
        return data1.get(random.nextInt(data1.size())) + " " + data2.get(random.nextInt(data2.size()));
    }

    private static LocalDateTime getRandomDate() {
        return LocalDateTime.now()
                .minusSeconds(random.nextInt(1000))
                .minusMinutes(random.nextInt(60))
                .minusHours(random.nextInt(24))
                .minusDays(random.nextInt(30))
                .minusMonths(random.nextInt(12))
                .minusYears(random.nextInt(20));
    }
}
