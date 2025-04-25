class Book implements Cloneable {
    int id;
    float price;

    Book(int id, float price) {
        this.id = id;
        this.price = price;
    }

    
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    void display() {
        System.out.println("Book ID: " + id + ", Price: " + price);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Book original = new Book(101, 299.99f);
        Book copy = original.clone();

        System.out.println("Original Book:");
        original.display();

        System.out.println("Cloned Book:");
        copy.display();
    }
}
