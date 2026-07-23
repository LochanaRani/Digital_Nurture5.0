public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");

        Product result1 = LinearSearch.linearSearch(products, 104);

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");


        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = BinarySearch.binarySearch(products, 104);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");
    }
}