package be.vdab.basishttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GetalController {

    @GetMapping("geluk")
    int geluksgetal(){
        return 7;
    }
   /* No puedes llamar a la misma URL porque el controlador no sabe qué hacer
   @GetMapping("geluk")
    int nogeengeluksgetal(){
        return 3;
    }
    */
   @GetMapping("ongeluk")
   int ongeluksgetal(){
       return 666;
   }
}
