import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        customers.put(1, new Customer(1, "Alice"));
        customers.put(2, new Customer(2, "Bob"));
        customers.put(3, new Customer(3, "Charlie"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.getOrDefault(id, null);
    }
}