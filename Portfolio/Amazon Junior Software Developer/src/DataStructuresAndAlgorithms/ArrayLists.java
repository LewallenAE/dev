package DataStructuresAndAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList lst = new ArrayList(); // Declaring an ArrayList without specifying a type
        lst.add("ArrayList declaration");  // Adding a String
        lst.add(123); // Adding an Integer
        System.out.println("Basic ArrayList: " + lst);


        ArrayList<String> capacityList = new ArrayList<>(50); // Initialize with an initial capacity of 50
        capacityList.add("Capacity");
        System.out.println("ArrayList with Initial Capacity: " + capacityList);

        ArrayList<String> asList = new ArrayList<>(Arrays.asList("Dell", "Lenovo", "HP"));
        System.out.println("ArrayList from Arrays.asList: " + asList);
        asList.add("Apple");
        System.out.println("Updated ArrayList: " + asList);

// Adding
  /*
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("20% Off All Items");
        ads.add("Free Shipping on Orders Over $50");
        System.out.println("Ads before adding new ad: " + ads);
        // Adding a new ad at the second position
        ads.add(1, "Clearance Sale - Up to 70% Off");
        System.out.println("Ads after adding at index 1: " + ads);


// Removal
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("Clearance Sale - Up to 70% Off");
        ads.add("Free Shipping on Orders Over $50");

        System.out.println("Original ads: " + ads);

        // Removing an ad by index
        ads.remove(0); // Remove the first ad
        System.out.println("Ads after removing the first ad: " + ads);

        // Removing an ad by content
        ads.remove("Clearance Sale - Up to 70% Off");
        System.out.println("Ads after removing 'Clearance Sale': " + ads);

// clear the whole block

        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("Clearance Sale - Up to 70% Off");
        ads.add("Free Shipping on Orders Over $50");

        System.out.println("Original ads: " + ads);

        // Removing an ad by index
        ads.remove(0); // Remove the first ad
        System.out.println("Ads after removing the first ad: " + ads);

        // Removing an ad by content
        ads.remove("Clearance Sale - Up to 70% Off");
        System.out.println("Ads after removing 'Clearance Sale': " + ads);

        System.out.println("Ads size before clearing: " + ads.size());

        // Clear all elements from the list
        ads.clear();
        if (ads != null) {
            System.out.println("Ads size after clearing: " + ads.size());
          */

            // Update Elements

            ArrayList<String> ads = new ArrayList<>();
            ads.add("Buy One Get One Free");
            ads.add("20% Off All Items");

            System.out.println("Before updating the ad: " + ads);

            // Updating an ad
            ads.set(1, "30% Off All Items");

            System.out.println("After updating the ad: " + ads);
            ads.add("The Programmer");
            ads.add("Andrew");
            ads.add("Design Patterns");
            ads.add("Erich");
            ads.add("Refactoring");
            ads.add("Martin");

            System.out.println("Updating the array list: " + ads);
        }

    }
