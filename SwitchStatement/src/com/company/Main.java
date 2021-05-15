package com.company;

public class Main {

    public static void main(String[] args) {
	    char alphabet = 'C';
	    switch(alphabet)
        {
            case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println(alphabet + " is found");
            break;
            default:
                System.out.println("A,B,C,D,E not found");
                break;
        }
        String month = "JUNE";
	    switch(month.toLowerCase()){ //converts month to lower case to match with cases.
            case "january": case "february": case "june": //all lower case coz of month.toLowerCase()
                System.out.println(month);
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
