package gr.aueb.cf.cf9.ch2;

public class OverflowApp {
public static void main(String[] args) {

    // Δήλωση και αρχικοποίηση μεταβλητών
    int num1 = Integer.MAX_VALUE;
    int num3 = Integer.MIN_VALUE;
    int num2 = 1;
    int result = 0;

    // Εντολές
    result = num1 + num2;

    // Εκτύπωση αποτελέσματος
    System.out.println("Το αποτέλεσμα είναι: " + result +"   "+num1+" "+num3);
    //Όταν ξεπερνούμε το όριο της μεταβλητής το αποτελέσμα ξεκινάει απο το μικρότερο όριο παει δηλαδή προσ τα πίσω στο min value
}
}
