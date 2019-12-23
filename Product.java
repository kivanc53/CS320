public class Product {
    String name;
    String dsc;
    double perprice;

    public Product(String name, String dsc, double perprice) {
        this.name = name;
        this.dsc = dsc;
        this.perprice = perprice;


    }


    public String takeinfo() {
        String str = name + "(" + dsc + ") ";
        str += "\nUnit per price for " + name + " = " + perprice;
        return str;
    }
}