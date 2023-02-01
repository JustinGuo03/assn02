public class Product {
    public String date;
    public String assemblyTime;
    public String category;
    public double fee;
    public double quantity;
    public double time;
    public int cost;

    public Product(String date, String assemblyTime, String category,
                   String fee, String quantity, String time, String cost) {
        this.date = date;
        this.assemblyTime = assemblyTime;
        this.category = category;
        this.fee = Double.parseDouble(fee);
        this.quantity = Double.parseDouble(quantity);
        this.time = Double.parseDouble(time);
        this.cost = Integer.parseInt(cost);
    }

    public Product(String[] item) {
        this.date = item[0];
        this.assemblyTime = item[1];
        this.category = item[2];
        this.fee = Double.parseDouble(item[3]);
        this.quantity = Double.parseDouble(item[4]);
        this.time = Double.parseDouble(item[5]);
        this.cost = Integer.parseInt(item[6]);
    }


}
