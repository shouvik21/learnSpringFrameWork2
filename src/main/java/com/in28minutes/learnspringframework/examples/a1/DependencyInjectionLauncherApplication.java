package com.in28minutes.learnspringframework.examples.a1;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
//perform component scan on current package
public class DependencyInjectionLauncherApplication {


    public static void main(String[] args) {


        //create configuration file

        //then create a spring context
        try(var context= new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){

        }





    }
}
