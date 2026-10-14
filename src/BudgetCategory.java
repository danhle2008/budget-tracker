public class BudgetCategory implements Comparable<BudgetCategory>{
    private String category; 
    private int limit; 
    private int spent;

    public BudgetCategory(String category, int limit, int spent) {
        this.category = category;
        this.limit = limit;
        this.spent = spent; 
    }

    public String toString() {
        return category + ", limit: " + limit + ", spent: " + spent;
    }
}


/* 
limit - 5 for groceries
limit - 30 for entertainment
limit + 100 for eating out 
order list


*/ 