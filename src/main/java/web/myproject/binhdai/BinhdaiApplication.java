package web.myproject.binhdai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceTransactionManagerAutoConfiguration;
// Bởi du án còn đang thử nghiệm nên có các thông tin như dưới đây
// Một khi đã co dự án đầy đủ thì không cần nữa
@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class
})
public class BinhdaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinhdaiApplication.class, args);
	}

}
