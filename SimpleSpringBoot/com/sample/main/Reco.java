package com.sample

@SpringBootApplication
public class Reco {
  public static void main(String[] args){
    new SpringApplicationBuilder(Reco.class).web(true).run(args);
  }

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
