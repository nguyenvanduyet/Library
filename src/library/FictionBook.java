package library;

public class FictionBook extends Book implements Discount {
    private String category;
    private double promotionalPrice;

    public FictionBook() {
    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(double bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public String toString() {
        return "FictionBook{" + "bookCode" + getBookCode() + "Name" + getName() + "price" + getPrice() + "author" + getAuthor() +
                "category='" + category +
                ", promotionalPrice=" + promotionalPrice +
                '}';
    }

    @Override
    public double setDiscount(int persent) {
       return promotionalPrice = getPrice()*(100-persent)/100;
    }
}
