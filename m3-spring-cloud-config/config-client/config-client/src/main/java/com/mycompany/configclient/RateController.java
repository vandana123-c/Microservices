package com.mycompany.configclient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class RateController {
     
      @Value("${rate}")
        String rate;
      @Value("${lanecount}")
        String lanecount;
      @Value("${tollstart}")
       String tollstart;


         @RequestMapping("/rates")
         public String getRate(Model m){
            m.addAttribute( "rateamount","rate");
            m.addAttribute("lanes",lanecount);
           m.addAttribute( "tollstart",tollstart);
          // //System.out.println("hello");

          return "rateview";
           }
           

}
