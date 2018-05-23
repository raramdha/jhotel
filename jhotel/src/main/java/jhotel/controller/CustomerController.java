package jhotel;
import org.springframework.web.bind.annotation.*;

/**
 * Class CustomerController menggambarkan fungsi-fungsi untuk memodifikasi Database Customer
 * dengan menggunakan web service
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * Method untuk membuat data Customer baru
     * @param name, email, password
     * @return  customer
     */
    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="password") String password) {
        Customer customer = new Customer(name, 10, 10, 10, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };

        return customer;
    }

    /**
     * Method untuk mengambil data Customer berdasarkan id
     * @param id
     */
    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }
    /**
     * Method untuk customer melakukan loginberdasarkan id
     * @param email, password
     */
    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value="email") String email,
                              @RequestParam(value="password") String password){
        try{
            return DatabaseCustomer.getCustomerLogin(email, password);
        }
        catch(Exception ex) {
            ex.getMessage();
            return null;
        }

    }


}