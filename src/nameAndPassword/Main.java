package nameAndPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 利用控制台获取用户输入的用户名字和密码
        Scanner console = new Scanner(System.in);
        System.out.println("Please input userName!");
        String userName = console.nextLine();

        //利用控制台获取用户输入的密码
        System.out.println("Please input userPassword!");
        String userPassword = console.nextLine();

        //使用类。
        UserLogin u1 = new UserLogin();
        u1.userName = userName;
        u1.userPassword = userPassword;
        if(u1.isValidUser()){
            System.out.println("Welcome to the page!");
        }else{
            System.out.println("you are not a user!");
        }
    }
}
