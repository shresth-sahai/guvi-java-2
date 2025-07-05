https://codepen.io/shresth0407/pen/jEEzyPV

/*
Spring boot -> 2 communcation styles -> 
1 REST -> HTTP protocol -> JSON / XML YAML 
Spring WEB -> RestController GetMapping PostMapping etc -> Lightweight 
Proper standards fr security 

securty -> HTTPS > transport level secutiy 
OAUTH / JWT ->

2 SOAP -> Simple Object Access protocol
XML 
Spring Web Services 
Built in security -> WS security 
heavy weight 
WSDL -> defines operations & messages 

*/
REST
@RestController
@RequestMapping 
public class UserEndPoint{
    @GetMapping
    public ResponseEntity<User> getUser(Long id){
        
    }
    
}
@EndPoint
public class UserEndPoint{
    private static final String NAMESPACE_URI="http://example.com/users";
    @PayloadRoot(namespace=NAMESPACE_URI,localPart="GetUserRequest")
    public GetUserResponse getUser(@RequestPayload GetUserRequest request){
        
    }
}














/*
Spring boot -> 2 communcation styles -> 
1 REST -> HTTP protocol -> JSON / XML YAML 
Spring WEB -> RestController GetMapping PostMapping etc -> Lightweight 
Proper standards fr security 

securty -> HTTPS > transport level secutiy 
OAUTH / JWT ->

2 SOAP -> Simple Object Access protocol
XML 
Spring Web Services 
Built in security -> WS security 
heavy weight 
WSDL -> defines operations & messages 

*/
REST
@RestController
@RequestMapping 
public class UserEndPoint{
    @GetMapping
    public ResponseEntity<User> getUser(Long id){
        
    }
    
}
@EndPoint
public class UserEndPoint{
    private static final String NAMESPACE_URI="http://example.com/users";
    @PayloadRoot(namespace=NAMESPACE_URI,localPart="GetUserRequest")
    public GetUserResponse getUser(@RequestPayload GetUserRequest request){
        
    }
}













