package nameAndPassword;

public class UserLogin {
    String userName;
    String userPassword;

    //设置无参数构造器
    UserLogin(){

    }

    //设置有参构造器
    UserLogin(String name,String password){
        userName = name;
        userPassword = password;
    }

    //判断用户是否已经注册,如果注册返回true，没有注册返回false。
    public boolean isValidUser(){
        boolean flag = false;
        if (userName.equals("admin") && userPassword.equals("admin")){
            flag = true;
        }
        return flag;
    }
}
