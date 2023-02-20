package sia.tacocloud.tacos.web;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import sia.tacocloud.tacos.core.domain.TacoOrder;
import sia.tacocloud.tacos.core.repository.OrderRepository;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private OrderRepository orderRepo;

    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors, SessionStatus sessionStatus) {

        if(errors.hasErrors()) {
            return "orderForm";
        }

        orderRepo.save(order);
//        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}
