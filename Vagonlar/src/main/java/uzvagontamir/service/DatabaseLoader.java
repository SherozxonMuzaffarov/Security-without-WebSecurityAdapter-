package uzvagontamir.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uzvagontamir.model.Role;
import uzvagontamir.model.*;
import uzvagontamir.repository.UserRepository;

@Configuration
public class DatabaseLoader {

    private UserRepository userRepository;

    public DatabaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//	@Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository){
//		return args ->{
//            User user = new User("admin", "admin", Role.ADMIN);
//            User user1 = new User("vchd-buxara", "11", Role.USER);
//            User user2 = new User("vchd-samarqand", "22", Role.USER);
//            User user3 = new User("vchd-xavast", "33", Role.USER);
//            User user4 = new User("vchd-toshkent", "44", Role.USER);
//            User user5 = new User("vchd-qarshi", "55", Role.USER);
//            User user6 = new User("vchd-termiz", "66", Role.USER);
//            User user7 = new User("vchd-andijon", "77", Role.USER);
//            User user8 = new User("vchd-kungirod", "88", Role.USER);
//            User user9 = new User("mz-andijon", "99", Role.USER);
//            User user10 = new User("depo-lmz", "10", Role.USER);
//            User user11 = new User("tashtvrz", "111", Role.USER);
//            userRepository.save(user);
//            userRepository.save(user1);
//            userRepository.save(user2);
//            userRepository.save(user3);
//            userRepository.save(user4);
//            userRepository.save(user5);
//            userRepository.save(user6);
//            userRepository.save(user7);
//            userRepository.save(user8);
//            userRepository.save(user9);
//            userRepository.save(user10);
//            userRepository.save(user11);
//        };
//	}
}
