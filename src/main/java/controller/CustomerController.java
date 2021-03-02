package controller;

import DAO.CustomerDAO;
import DAO.ICustomerDAO;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerDAO customerDAO;

    @GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list","customers",customerDAO.all());
        return modelAndView;
    }

    @GetMapping("update")
    public ModelAndView update(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("update","customer",customerDAO.findById(id-1));
        return modelAndView;
    }

    @PostMapping("update")
    public ModelAndView saveEdit(@RequestParam int id , String name , String email, String address){
        Customer customer = new Customer(id,name,email,address);
        customerDAO.save(customer,id);
        ModelAndView modelAndView = new ModelAndView("list","customers",customerDAO.all());
        return modelAndView;
    }
}
