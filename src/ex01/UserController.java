package ex01;

@Controller
public class UserController {

    @RequestMapping(uri = "/userInfo")
    public void userInfo() {
        System.out.println("userInfo() 호출됨");
    }

    @RequestMapping(uri = "/login")
    public void login() {
        System.out.println("login() 호출됨");
    }

    @RequestMapping(uri = "/join")
    public void join() {
        System.out.println("join() 호출됨");
    }

    @RequestMapping(uri = "/joinForm")
    public void joinForm() {
        System.out.println("joinForm() 호출됨");
    }

    @RequestMapping(uri = "/loginForm")
    public void loginForm() {
        System.out.println("loginForm() 호출됨");
    }
}
