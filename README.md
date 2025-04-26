# Assignment-4
Submitting assignment no 4 of Advance Programming 


Assignment no 4 :

class Book implements Cloneable {
    int id;
    float price;

    Book(int id, float price) {
        this.id = id;
        this.price = price;
    }

    // Shallow clone using Object's clone() method
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
