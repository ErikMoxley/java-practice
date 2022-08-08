public class checkNum {
    public static void main(String[] args) {
        // Add number below for true and anything else for false/else
        String string = "12";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}

// run code to see result