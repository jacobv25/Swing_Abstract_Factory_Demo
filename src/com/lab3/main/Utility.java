package com.lab3.main;

import com.lab3.Factory.SelectionPanelFactory;
import com.lab3.Factory.SelectionPanelFactoryIF;

public class Utility {

    private static Utility instance = new Utility();

    private Utility() {};

    public static Utility getInstance() {
        return instance;
    }

    public SelectionPanelFactoryIF getSelectionPanelFactory() {
        return  new SelectionPanelFactory();
    }

    public DifficultyMode InputToMode(String input) {
        switch (input) {
            case "0":
                return DifficultyMode.BEGINNER;
            case "1":
                return DifficultyMode.INTERMEDIATE;
            case "2":
                return DifficultyMode.ADVANCE;
            default:
                return null;
        }
    }

    //EXAMPLE CODE FROM PREVIOUS PROJECT. DELETE WHEN DONE USING
//
//    public SortingUtilityIF getSortingUtility() {
//        return new SortingUtilityLoggerProxy();
//    }
//
//    public ProductFactory getProductFactory() { return new ProductFactory();}
//
//    public SidebarFactory getSidebarFactory() { return new SidebarFactory();}
//
//    public void DisplayProduct(Product product, int sortingAlgorithm) {
//
//        if (sortingAlgorithm == 0) {
//            System.out.println("ID=" + product.getId());
//            System.out.println("Name=" + product.getName());
//        }
//        else if (sortingAlgorithm == 1) {
//            System.out.println("Name=" + product.getName());
//            System.out.println("ID=" + product.getId());
//        }
//
//        System.out.println("Price=" + product.getPrice());
//
//        if (product.getClass() == Book.class) {
//            System.out.println(((Book) product).getAuthor());
//        }
//        else if (product.getClass() == ShirtButton.class) {
//            System.out.println(((ShirtButton) product).getColor());
//        }
//        else if (product.getClass() == Bag.class) {
//            System.out.println(((Bag) product).getSize());
//        }
//
//    }

}
