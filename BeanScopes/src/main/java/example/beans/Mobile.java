package example.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile {

    private String brandName;
    private int price;

    @Override
    public String toString() {
        return "Mobile{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
