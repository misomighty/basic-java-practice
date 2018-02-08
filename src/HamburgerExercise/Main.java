package HamburgerExercise;

class Hamburger {
    private String bun = null;
    private String meat = null;
    private double basePrice = 5.00;

    private int totalExtras = 4;
    private String extra1 = null;
    private double extra1Price = 0;
    private String extra2 = null;
    private double extra2Price = 0;
    private String extra3 = null;
    private double extra3Price = 0;
    private String extra4 = null;
    private double extra4Price = 0;

    public Hamburger(String bun, String meat, int totalExtras) {
        this.bun = bun;
        this.meat = meat;
        this.totalExtras = totalExtras;
    }

    public String itemize() {
        String str = "bun: " + getBun() + "\n" + "meat: " + getMeat() + "\n";
        double total = 0;
        if(extra1 != null) {
            total += getExtra1Price();
            str += "added " + getExtra1() + " for an extra " + getExtra1Price() + "\n";
        }if(extra2 != null) {
            total += getExtra2Price();
            str += "added " + getExtra2() + " for an extra " + getExtra2Price() + "\n";
        }if(extra3 != null) {
            total += getExtra3Price();
            str += "added " + getExtra3() + " for an extra " + getExtra3Price() + "\n";
        }if(extra4 != null) {
            total += getExtra4Price();
            str += "added " + getExtra4() + " for an extra " + getExtra4Price() + "\n";
        }
        str += ("Total: " + (total + basePrice));
        return str;
    }

    public void addExtra1(String name, double price) {
        this.extra1 = name;
        this.extra1Price = price;
    }
    public void addExtra2(String name, double price) {
        this.extra2 = name;
        this.extra2Price = price;
    }
    public void addExtra3(String name, double price) {
        this.extra3 = name;
        this.extra3Price = price;
    }
    public void addExtra4(String name, double price) {
        this.extra4 = name;
        this.extra4Price = price;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getTotalExtras() {
        return totalExtras;
    }

    public String getExtra1() {
        return extra1;
    }

    public double getExtra1Price() {
        return extra1Price;
    }

    public String getExtra2() {
        return extra2;
    }

    public double getExtra2Price() {
        return extra2Price;
    }

    public String getExtra3() {
        return extra3;
    }

    public double getExtra3Price() {
        return extra3Price;
    }

    public String getExtra4() {
        return extra4;
    }

    public double getExtra4Price() {
        return extra4Price;
    }
}

class Healthy extends Hamburger{
    private String meat = null;
    private int totalExtras = 0;
    private double basePrice = 7.00;

    private String healthyExtra1 = null;
    private double healthyExtra1Price = 0;
    private String healthyExtra2 = null;
    private double healthyExtra2Price = 0;
    private String healthyExtra3 = null;
    private double healthyExtra3Price = 0;

    public Healthy(String meat, int totalExtras) {
        super("Brown rye", meat, totalExtras);
        this.meat = meat;
        this.totalExtras = totalExtras;
    }

    public void addHealthyExtra1(String name, double price) {
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
    }
    public void addHealthyExtra3(String name, double price) {
        this.healthyExtra3 = name;
        this.healthyExtra3Price = price;
    }

    public String itemize() {
        String str = "bun: " + getBun() + "\n" + "meat: " + getMeat() + "\n";
        double total = 0;
        if(healthyExtra1 != null) {
            total += getHealthyExtra1Price();
            str += "adding " + getHealthyExtra1() + " for an extra " + getHealthyExtra1Price() + "\n";
        }if(healthyExtra2 != null) {
            total += getHealthyExtra2Price();
            str += "adding " + getHealthyExtra2() + " for an extra " + getHealthyExtra2Price() + "\n";
        }if(healthyExtra3 != null) {
            total += getHealthyExtra3Price();
            str += "adding " + getHealthyExtra3() + " for an extra " + getHealthyExtra3Price() + "\n";
        }if(super.getExtra1() != null) {
            total += super.getExtra1Price();
            str += "adding " + super.getExtra1() + " for an extra " + super.getExtra1Price() + "\n";
        }if(super.getExtra2() != null) {
            total += super.getExtra1Price();
            str += "adding " + super.getExtra2() + " for an extra " + super.getExtra2Price() + "\n";
        }if(super.getExtra3() != null) {
            total += super.getExtra1Price();
            str += "adding " + super.getExtra3() + " for an extra " + super.getExtra3Price() + "\n";
        }if(super.getExtra4() != null) {
            total += super.getExtra1Price();
            str += "adding " + super.getExtra4() + " for an extra " + super.getExtra4Price() + "\n";
        }

        str += "Total: " + (total + basePrice);
        return str;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public int getTotalExtras() {
        return totalExtras;
    }

    public String getHealthyExtra1() {
        return healthyExtra1;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2() {
        return healthyExtra2;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public String getHealthyExtra3() {
        return healthyExtra3;
    }

    public double getHealthyExtra3Price() {
        return healthyExtra3Price;
    }


}
public class Main {
    public static void main(String[] args) {
        Hamburger basic = new Hamburger("White", "Single", 4);
        basic.addExtra1("lettuce", 0.25);
        basic.addExtra2("lettuce", 0.25);
        basic.addExtra3("lettuce", 0.25);
        basic.addExtra4("lettuce", 0.25);
        System.out.println(basic.itemize());
        System.out.println("------------------------------------------------------------");

        Healthy healthy = new Healthy("black bean", 6);
        healthy.addHealthyExtra1("avocado", 3.50);
        healthy.addHealthyExtra2("quinoa", 3.50);
        healthy.addHealthyExtra3("flax", 3.50);
        System.out.println(healthy.itemize());
        System.out.println("------------------------------------------------------------");

    }
}
