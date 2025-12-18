@RestController
public class AuthController{
        @Autowired
        UserService ser;
        @PostMapping("/auth/register")
        public User register(@RequestBody User user){
           return user.register(user);
        }
       @GetMapping("/auth/email/{email}")
       public User getByEmail(@PathVariable String email){
        return user.findByEmail(email);
       }
       
}