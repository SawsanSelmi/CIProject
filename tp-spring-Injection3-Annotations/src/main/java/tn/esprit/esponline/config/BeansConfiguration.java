package tn.esprit.esponline.config;

import org.springframework.context.annotation.ComponentScan;

/* Use @Configuration annotation to tell spring AnnotationConfigApplicationContext that this class is bean configuration java class. */

//@ComponentScan(basePackages = {"tn.esprit.esponline.control", 
//		"tn.esprit.esponline.service", "tn.esprit.esponline.dao"})

@ComponentScan("tn.esprit.esponline")
public class BeansConfiguration 
{}