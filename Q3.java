import java.util.Scanner;

interface customer{
    String name = null;
    float balance = 0;
    public void buyProduct(product p);
}
interface VIPCustomer extends customer{
    public void buyProduct(product p);
}
interface getDis{
    public float getDiscountedPrice();
    public void printDetails();
}
class Cbuying implements customer{
    String name=null;
    float balance=0;
    public void setCustomerInfo(String c_name,float balance)
    {
        this.balance=balance;
        this.name=c_name;
    }
    @Override
    public void buyProduct(product product) {

        if(product.getDiscountedPrice()<balance){
            System.out.println("\nCustomer name: "+name+"\nCustomer balance: %f"+balance);
            balance-=product.getDiscountedPrice();
            System.out.println("\nCustomer has bought the product and his balance is "+balance);
        }
        else{
            System.out.printf("\nCustomer name: %s\nCustomer balance: %f",name,balance);
            System.out.println("\nCustomer cannot buy product");
        }
    }
}
class product implements getDis{
    protected String name;
    protected  float price;
    float disPrice,avgPrice;
    String concatenated_name;
    public product(String name,float price)
    {
        this.name=name;
        this.price=price;
    }
    public product add(product p2)
    {
        avgPrice=(price+p2.price)/2F;
        concatenated_name=name+p2.name;
        return new product(concatenated_name,avgPrice);

    }

    public float getDiscountedPrice()
    {
        disPrice=price-(price/4);
        return disPrice;
    }

    public void printDetails()
    {
        System.out.printf("\nITEM\nitem name: %s\nitem Price: %f\nDiscounted price: %f ",
                name,price,getDiscountedPrice());
    }
}


class book extends product{
    private String author;
    public book(String name, float price,String author)
    {
        super(name,price);
        this.author=author;
    }
    public void printDetails()
    {
        System.out.printf("\nITEM\nBook name: %s\nBook author: %s\nProduct Price: %f\nDiscounted price: %f ", name,author,price,getDiscountedPrice());
    }
}
class electronic extends product{
    private String brand;
    public electronic(String name, float price,String brand)
    {
        super(name,price);
        this.brand=brand;
    }
    public void printDetails()
    {
        System.out.printf("\n\nITEM\nBook name: %s\nBrand: %s\nProduct Price: %f\nDiscounted price: %f ",
                name,brand,price,getDiscountedPrice());
    }
}
class clothing extends product{
    private String size;
    float disPrice;
    public clothing(String name, float price,String size)
    {
        super(name,price);
        this.size=size;
    }
    public float getDiscountedPrice()
    {
        disPrice=price-(price/4);
        return disPrice;
    }
    public void printDetails()
    {
        System.out.printf("\nITEM\nBook name: %s\nSize:  %s\nProduct Price: %f\nDiscounted price: %f ",
                name,size,price,getDiscountedPrice());
    }
}

public class A2_Q3_22K4029 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter book name, price, and author");
        String name=sc.next();
        int price=sc.nextInt();
        String author=sc.next();
        product product=new book(name,price,author);
        System.out.println("\nEnter Cloth type, price, and size");
        String type=sc.next();
        int price1=sc.nextInt();
        String size=sc.next();
        product c=new clothing(type,price1,size);
        System.out.println("\nEnter Electronic name, price, and brand");
        String name1=sc.next();
        int price2=sc.nextInt();
        String brand=sc.next();
        product E =new electronic(name1,price2,brand);
        Cbuying customer_1=new Cbuying(); //2 CUSTOMERS
        Cbuying customer_2=new Cbuying();
        product.printDetails();
        customer_1.setCustomerInfo("22K-4029",1230);
        customer_1.buyProduct(product);
        c.printDetails();
        customer_2.setCustomerInfo("22K-4029",600);
        customer_2.buyProduct(c);
        product p1=new product("Book",50);
        product p2=new product("Pen",30);
        product p3=p1.add(p2);
        p3.printDetails();

    }
}

