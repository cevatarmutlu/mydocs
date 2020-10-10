package com.first_spring_boot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Bu class' ın bir web api' yı olabilmesi için RestController ile anote edilmesi gerekiyor. 
// Sadece RestController değil başka bir şeyde varmış. RestApi diye bir şeyden bahsediyor ama
// böyle bir şey otomatik olarak tamamlanmadı.

@RestController
// RestController ne yapacak: Bu class' ı bir restful api' yı olarak dışarıya acacakmış.
@RequestMapping("/mesaj")
// RequestMapping ise bu api' yin hangi adreste yayınlanacağını belirlediğimiz bir annotation.
public class MerhabaApi {

    @GetMapping
    // Yukarıda yazdığımız adrese get isteği yapıldığında aşağıdaki metot çalışsın demek
    public String merhaba() {
        return "Merhaba";
    }
    
}
