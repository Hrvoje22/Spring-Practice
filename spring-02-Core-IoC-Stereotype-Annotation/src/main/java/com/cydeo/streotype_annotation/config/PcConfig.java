package com.cydeo.streotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cydeo.streotype_annotation") //to scan the package (what we want) in search for @Component
public class PcConfig {
}
