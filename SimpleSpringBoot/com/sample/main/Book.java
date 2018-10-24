package com.sample

import lombok.Data;

  @Data
  class Book{
  final String title;
  
  Book(String title){
  this.title = title;
  }
    
 }
