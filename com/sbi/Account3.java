package com.sbi;

public class Account3
{
	public class Hostel {
	    // Attributes of the Hostel class
	    private String name;
	    private double rent;
	    private String owner;
	    private boolean acAvailable;

	    // Constructor to initialize the attributes
	    public Hostel(String name, double rent, String owner, boolean acAvailable) {
	        this.name = name;
	        this.rent = rent;
	        this.owner = owner;
	        this.acAvailable = acAvailable;
	    }

	    // Method to display hostel information
	    public void displayHostelInfo() {
	        System.out.println("Hostel Name: " + name);
	        System.out.println("Rent: $" + rent);
	        System.out.println("Owner: " + owner);
	        checkAcAvailability();  // Call the method to check AC availability
	    }

	    // Method to check and display AC availability
	    private void checkAcAvailability() {
	        // Using boolean logic to check AC availability
	        if (acAvailable) {
	            System.out.println("AC: Available");
	        } else {
	            System.out.println("AC: Not Available");
	        }
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        // Create instances of Hostel with various details
	        Hostel hostel1 = new Hostel("Sunrise Hostel", 1500.00, "Alice", true);
	        Hostel hostel2 = new Hostel("Moonlight Hostel", 1200.00, "Bob", false);

	        // Display information for each hostel
	        hostel1.displayHostelInfo();
	        System.out.println(); // For spacing between hostels
	        hostel2.displayHostelInfo();
	    }
	}

}
