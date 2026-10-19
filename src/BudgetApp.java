import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        BudgetCategory groceries = new BudgetCategory("Groceries", 245, 240);
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 100, 70);
        BudgetCategory eatingOut = new BudgetCategory("Eating Out", 100, 200);
        
        System.out.println(groceries);
        System.out.println(entertainment);
        System.out.println(eatingOut);

        List<BudgetCategory> categories = new ArrayList<>();
        categories.add(groceries); 
        categories.add(entertainment); 
        categories.add(eatingOut);
        
        Collections.sort(categories);
        System.out.println(categories);

        // while(scan.hasNextLine()) {
        //     String category = scan.nextLine();

        //     double limit = scan.nextDouble();
        //     double spent = scan.nextDouble();

        //     // Consume \n after spent input 
        //     if(scan.hasNextLine()) scan.nextLine();

        //     String limitString = String.format("$%.2f", limit);
        //     String spentString = String.format("$%.2f", spent);
        //     // System.out.println("The budget limit for " + category + " was: " + limitString + " but the actual spend was " + spentString);
        // }
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    // public static int budgetDifference(List<BudgetCategory> categories) {
    //     // TODO: You will implement this method in Wave 4
    //     // Note that this method SHOULD NOT have a print statement.
    //     // It should instead return the value.
    //     return -1;
    // }
}
