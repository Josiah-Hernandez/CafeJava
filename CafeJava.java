public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 5.5;

        double dripCoffee = 8.5;
        double largeLatte = 9.5;
        double smallCappuccino = 10.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        System.out.println(customer1 + "Ordered A Coffee");
        System.out.println(customer4 + "Odered A Cappuccino");
            if (isReadyOrder1){
                System.out.println(pendingMessage);
            } else{
                System.out.println(customer4 + readyMessage + "the total is" + smallCappuccino);
            }
        
        System.out.println(customer2 + "Ordered 2 Lattes");
        if (isReadyOrder1 != false){
            System.out.println(pendingMessage);
        } else{
            System.out.println(customer2 + readyMessage + "the total is" + largeLatte * 2);
        }

        System.out.println(customer3 + "Wrong Order" + displayTotalMessage + (dripCoffee - largeLatte));
    }
}
