public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Chair", "Furniture"),
            new Product(3, "Shoes", "Apparel"),
            new Product(4, "Tablet", "Electronics")
        };

        String searchTerm = "Shoes";

        
        Product linearResult = LinearSearch.linearSearch(products, searchTerm);
        System.out.println("Linear Search Result: " +
            (linearResult != null ? linearResult.productName : "Not Found"));

        
        Product binaryResult = BinarySearch.binarySearch(products, searchTerm);
        System.out.println("Binary Search Result: " +
            (binaryResult != null ? binaryResult.productName : "Not Found"));
    }
}
