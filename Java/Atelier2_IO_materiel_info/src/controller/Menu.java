package controller;



public class Menu {
	public static void main(String[] args) {
        ComposantController composantController = new ComposantController();
        int option;
        
        do {
            option = composantController.showMenu();
            switch (option) {
                case 1 -> // create product
                		composantController.createProduct();
                case 2 -> //list products
                		composantController.showAll();
                case 3 -> //delete product
                		composantController.delete();
                case 4 -> //exit
                        System.out.println("bye!");
                default -> System.out.println("Option " + option + " non trouvée");
            }
        } while (option!= 4);
    }
}
