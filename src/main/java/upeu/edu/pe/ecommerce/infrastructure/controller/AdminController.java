
package upeu.edu.pe.ecommerce.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Mrsta
 */
@Controller
@RequestMapping("/admin")

public class AdminController {

    @GetMapping
    public String home() {

        return "admin/home";

    }

}
