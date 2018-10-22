package com.sample

@RestController
@RequestMapping("/api/reco")
class RecoController {

    @Autowired
    RestTemplate restTemplate;
    
    Set<Book> kidsReco = Set.newHashSet(new Book("Guliver Travels"), new Book("Harry Porter"));
    Set<Book> adultReco = Set.newHashSet(new Book("Game of Thrones"), new Book("Da Vinci Code"));

@RequestMapping("/{user}")
public Set<Book> findRecoForUser(@PathVariable String user) throws UserNotFoundException {
  Customer customer = restTemplate.getForObjecr("url"),Customer.class, user);
  if(member == null)
    throw new UserNotFoundException();
  return customer.age<14?kidReco:adultReco;

  }
}
