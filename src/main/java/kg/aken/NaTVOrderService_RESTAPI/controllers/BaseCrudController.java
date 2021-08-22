package kg.aken.NaTVOrderService_RESTAPI.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
public interface BaseCrudController <S, T>{
    @PostMapping("/save")
    S save(@RequestBody S s);

    @GetMapping("/all")
    List<S> findAll();

    @PutMapping("/update")
    S update(@RequestBody S s);

    @GetMapping("/{id}")
    S findById(@PathVariable T id);

    @GetMapping("/delete/{id}")
    void deleteById(@PathVariable T id);


}
