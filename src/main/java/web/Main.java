//package web;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.AppConfig;
//import web.model.Users;
//import web.service.UserService;
//
//public class Main {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//        userService.add(new Users("User3", "Lastname3", "user3@mail.ru"));
//        userService.add(new Users("User4", "Lastname4", "user4@mail.ru"));
//
//    }
//}
