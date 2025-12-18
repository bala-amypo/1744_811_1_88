@RestController
public class UserController{
        @Autowired
        UserService ser;
        @PostMapping("/register")
        public User register(@RequestBody User user){
           return user.register(user);
        }
       @GetMapping("/email/{email}")
       public User getByEmail(@PathVariable String email){
        return user.findByEmail(email);
       }

     
}