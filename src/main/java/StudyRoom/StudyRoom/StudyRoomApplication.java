package StudyRoom.StudyRoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaAuditing

public class StudyRoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyRoomApplication.class, args);
	}

}
