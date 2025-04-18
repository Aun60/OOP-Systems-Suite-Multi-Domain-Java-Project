import java.util.Objects;
import java.util.Scanner;
class Juice{
    Scanner sc=new Scanner(System.in);
    static int num_of_objects,total_bill;
    String Sid,name;

    void print(String name,String id)
    {
        this.name=name;
        this.Sid=id;
        System.out.println("\nCustomer Name: "+name+"\nCustomer sale ID: "+Sid);
    }

    public Juice(int num)
    {
        num_of_objects+=num;
    }
    int major_type;
    public int major_menu()
    {
        System.out.println("\nEnter choice 1,2,3");
        System.out.println("\n1)Fruit juice\n2)Vegetable juice\n3)Mixed juice");

        major_type=sc.nextInt();
        if (major_type==1){
            return 1;}
        else if (major_type==2){
            return 2;}
        else if(major_type==3){
            return 3;}
        else {
            return 0;}

    }
    public int  sub_menu(int num){
        System.out.println("Enter your choice 1,2 or 3\n");
        if(num==1){
            System.out.println("1)Tropical juice  RS 150\n2)Berry juice  RS 100\n3)Citrus juice  RS 400");}
        else if (num==2){
            System.out.println("1)Root green juice  RS 130\n2)Leafy vegetable juice  RS 380 \n3)Mixed vegetable juice  RS 160");}
        else if(num==3){
            System.out.println("1)Smoothie juice  RS 200 \n2) Fruit juice  RS 120");
        }
        else {
            System.out.println("Enter correct choice");
        }

        int choice=sc.nextInt();
        switch (choice){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3 :
                return 3;
            default:
                return 0;
        }


    }
}
class fruit_juice extends Juice{
    public fruit_juice(int num) {

        super(num);
    }
}
class vegetable_juice extends Juice{
    public vegetable_juice(int num) {
        super(num);

    }
}
class mixed_juice extends Juice{
    public mixed_juice(int num)
    {
        super(num);

    }
}
class citrus_juice extends fruit_juice{
    int price=150;
    String ingredients,taste;
    public citrus_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.println(name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}

class berry_juice extends fruit_juice{
    int price=350;
    String taste="sour",ingredients="Salt";
    public berry_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class tropical_juice extends fruit_juice{
    int price=420;
    String ingredients="Sugar";
    String taste="MEETHA";
    public tropical_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class leafy_green_juice extends vegetable_juice{
    int price=250;
    String ingredients;
    String taste;
    public leafy_green_juice(int n1)
    {
        super(n1);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class root_vegetable_juice extends vegetable_juice{
    int price=350;
    String ingredients="root";
    String taste="pheeka";
    public root_vegetable_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class mixed_vegetable_juice extends vegetable_juice{
    int price=450;
    String ingredients="Vegetables";
    String taste="KARWA";
    public mixed_vegetable_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class fruit_veggie_juice extends mixed_juice{
    int price=300;
    String ingredients="Fruit";
    String taste="sweet";
    public fruit_veggie_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
class smoothie_juice extends mixed_juice{
    int price=250;
    String ingredients;
    String taste;
    public smoothie_juice(int num)
    {
        super(num);
    }
    void print(String name,String sid)
    {
        super.print (name,sid);
        System.out.printf("\n"+name+"with id"+sid+"wants smoothie fruit juice");
        total_bill+=price;
    }
}
public class A2_Q1_22K_4029 {
    public static void main(String[] args) {
        int k=0;
        int n=0;
        sale[] sale_object = new sale[2];
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nEnter your name ");
            String cname = sc.next();
            System.out.println("Enter id");
            String id = sc.next();
            Juice j = new Juice(1);
            int major_choice = j.major_menu();
            int sub_choice = j.sub_menu(major_choice);

            System.out.printf("\n---SALE %d---",k+1);
            if (major_choice == 1) {
                switch (sub_choice) {
                    case 1:
                        citrus_juice cit = new citrus_juice( 1);
                        cit.print(cname, id);
                        break;
                    case 2:
                        berry_juice b = new berry_juice( 1);
                        b.print(cname, id);
                        break;
                    case 3:
                        tropical_juice t = new tropical_juice( 1);
                        t.print(cname, id);
                        break;

                }
            } else if (major_choice == 2) {
                switch (sub_choice) {
                    case 1:
                        leafy_green_juice lg = new leafy_green_juice( 1);
                        lg.print(cname, id);
                        break;
                    case 2:
                        root_vegetable_juice rv = new root_vegetable_juice( 1);
                        rv.print(cname, id);
                        break;
                    case 3:
                        mixed_vegetable_juice mv = new mixed_vegetable_juice(1);
                        mv.print(cname, id);
                        break;

                }
            } else if (major_choice == 3) {
                switch (sub_choice) {
                    case 1:
                        fruit_veggie_juice fv = new fruit_veggie_juice(1);
                        fv.print(cname, id);
                        break;
                    case 2:
                        smoothie_juice s = new smoothie_juice( 1);
                        s.print(cname, id);
                        break;

                }
            }
            k++;
        }while(k<=1);
    }
}

