package io.dickson.liquibasesample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRepo extends CrudRepository<DatabaseChangeLog, Long> {
	@Value("${spring.datasource.url}")
	public final String url="jdbc:mysql://localhost:3306/liquibase";

	@Value("${spring.datasource.username}")
	public final String username="root";

	@Value("${spring.datasource.password}")
	public final String password="root";

	@Value("${spring.datasource.driver-class-name}")
	public final String driver="com.mysql.jdbc.Driver";

	/*
	 * @Query("SELECT name FROM DatabaseChangeLog s WHERE s.name LIKE %:studentName%"
	 * ) String findByName(String studentName);
	 */

}
