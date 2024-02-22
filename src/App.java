import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       while(true){
        System.out.println("order pleaseeeee \n Do you need \n 1.VEG or \n 2.NON-VEG");
        int pizzatype = sc.nextInt();
        System.out.println("Do you Need extra Cheese: \n 1.YES or 2.NO");
        int extracheese = sc.nextInt();
        System.out.println("Do you Need extra topings: \n 1.YES or 2.NO");
        int extratoppings = sc.nextInt();
        System.out.println("Do you Need Take away option: \n 1.YES or 2.NO");
        int takeaway = sc.nextInt();
        System.out.println("select the option: \n 1.confirm order or 2.reorder");
        int orderconfirm = sc.nextInt();
        if (orderconfirm == 1) {
            if (pizzatype == 1) {
                Pizza order = new Pizza(true);
                if (extracheese == 1) {
                    order.extracheese();
                }
                if (extratoppings == 1) {
                    order.extratoppings();
                }
                if (takeaway == 1) {
                    order.takeaway();
                }
                order.getbill();
            } else if (pizzatype == 2) {
                Pizza order = new Pizza(false);
                if (extracheese == 1) {
                    order.extracheese();
                }
                if (extratoppings == 1) {
                    order.extratoppings();
                }
                if (takeaway == 1) {
                    order.takeaway();
                }
                order.getbill();
            }
            return;
        }

        }
    }
}
