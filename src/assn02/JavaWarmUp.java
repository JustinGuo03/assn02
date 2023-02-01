package assn02;
import java.util.Scanner;

public class JavaWarmUp{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //System.out.print("How many items to be added to the database: ");
        int itemNum = input.nextInt();

        Product[] database = new Product[itemNum];

        String newItem = input.nextLine();

        for (int i = 0; i<itemNum; i++){
            //System.out.print("Enter new item: ");
            newItem = input.nextLine();

            database[i] = new Product(newItem.split(" "));
        }

        printReport(database);
    }

    public static void highestAssemblyFee(Product[] database){
        Product largest = database[0];

        for (int i = 0; i < database.length; i++) {
            if (database[i].fee >= largest.fee) {
                largest = database[i];
            }
        }

        System.out.printf("\tWhen: %s %s\n\tCategory: %s\n\tPrice: %.2f\n", largest.date, largest.assemblyTime, largest.category, largest.fee);
    }

    public static void lowestAssemblyFee(Product[] database){
        Product lowest = database[0];

        for (int i = 0; i < database.length; i++) {
            if (database[i].fee <= lowest.fee) {
                lowest = database[i];
            }
        }

        System.out.printf("\tWhen: %s %s\n\tCategory: %s\n\tPrice: %.2f\n", lowest.date, lowest.assemblyTime, lowest.category, lowest.fee);
    }

    public static void phoneStat(Product[] database){
        int quantity = 0;
        int totalFee = 0;
        int totalCosts = 0;
        int workerCosts = 0;

        for (int i = 0; i < database.length; i++) {
            if (database[i].category.equals("phone")) {
                quantity += database[i].quantity;
                totalFee += database[i].quantity*database[i].fee;
                totalCosts += database[i].cost;
                workerCosts += database[i].time*16;
            }
        }

        double avgFee = (double) totalFee/(double) quantity;
        double avgProfits = (double) (totalFee - totalCosts - workerCosts)/(double) quantity;

        System.out.printf("\tQuantity: %d\n\tAverage Assembling fee: %.2f\n\tAverage Net Profit: %.2f\n", quantity, avgFee, avgProfits);
    }

    public static void laptopStat(Product[] database){
        int quantity = 0;
        int totalFee = 0;
        int totalCosts = 0;
        int workerCosts = 0;

        for (int i = 0; i < database.length; i++) {
            if (database[i].category.equals("laptop")) {
                quantity += database[i].quantity;
                totalFee += database[i].quantity*database[i].fee;
                totalCosts += database[i].cost;
                workerCosts += database[i].time*16;
            }
        }

        double avgFee = (double) totalFee/(double) quantity;
        double avgProfits = (double) (totalFee - totalCosts - workerCosts)/(double) quantity;

        System.out.printf("\tQuantity: %d\n\tAverage Assembling fee: %f\n\tAverage Net Profit: %.2f\n", quantity, avgFee, avgProfits);
    }

    public static void watchStat(Product[] database){
        int quantity = 0;
        int totalFee = 0;
        int totalCosts = 0;
        int workerCosts = 0;

        for (int i = 0; i < database.length; i++) {
            if (database[i].category.equals("smart_watch")) {
                quantity += database[i].quantity;
                totalFee += database[i].quantity*database[i].fee;
                totalCosts += database[i].cost;
                workerCosts += database[i].time*16;
            }
        }

        double avgFee = (double) totalFee/(double) quantity;
        double avgProfits = (double) (totalFee - totalCosts - workerCosts)/(double) quantity;

        System.out.printf("\tQuantity: %d\n\tAverage Assembling fee: %.2f\n\tAverage Net Profit: %.2f\n", quantity, avgFee, avgProfits);
    }

    public static void printReport(Product[] database){
        System.out.println("Highest per unit assembling fee:");
        highestAssemblyFee(database);
        System.out.println("Lowest per unit assembling fee:");
        lowestAssemblyFee(database);
        System.out.println("Statistic of phone");
        phoneStat(database);
        System.out.println("Statistic of laptop");
        laptopStat(database);
        System.out.println("Statistic of smart_watch");
        watchStat(database);
    }
}