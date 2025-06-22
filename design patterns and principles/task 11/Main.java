public class Main {
    public static void main(String[] args) {
        // Manual Dependency Injection
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.printCustomerById(2);  // should print Bob
        service.printCustomerById(5);  // not found
    }
}