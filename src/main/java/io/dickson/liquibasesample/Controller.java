package io.dickson.liquibasesample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;

import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.resource.FileSystemResourceAccessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("students")
public class Controller {

	@Value("${spring.datasource.url}")
	private String springDatasourceUrl = "jdbc:mysql://localhost:3306/liquibase";

	@Value("${spring.datasource.username}")
	private String username = "root";

	@Value("${spring.datasource.password}")
	private String password = "root";

	@Value("${spring.datasource.driver-class-name}")
	private String driver = "com.mysql.jdbc.Driver";

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ChangeRepo changeRepo;

	/*
	 * @PostMapping("student") public String createStudent(@RequestParam String
	 * name) { studentRepository.save(new Student(name, "Santa Clara University"));
	 * String nameToReturn = studentRepository.findByName(name); return
	 * studentRepository.findByName(name) + " Saved successfully"; }
	 * 
	 * @GetMapping("student") public List<Student> getAllStudents() { return
	 * (List<Student>) studentRepository.findAll(); }
	 */

	@GetMapping("databasechangelog")
	public List<DatabaseChangeLog> getAll() {

		//url = "jdbc:mysql://localhost:3306/liquibase";
		username = "root";
		password = "root";
		driver = "com.mysql.jdbc.Driver";

		/*
		 * java.sql.Connection c = ""; Liquibase liquibase = null; try { Database
		 * database =
		 * DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new
		 * JdbcConnection(c)) liquibase = new Liquibase(YOUR_CHANGELOG, new
		 * FileSystemResourceAccessor(), database); liquibase.update(); } catch
		 * (SQLException e) { throw new DatabaseException(e); } finally { if (c != null)
		 * { try { c.rollback(); c.close(); } catch (SQLException e) { //nothing to do }
		 * } }
		 */
		System.out.println(springDatasourceUrl+"data");
		return (List<DatabaseChangeLog>) changeRepo.findAll();
	}
	/*
	 * public static void runLiquibase() {
	 * 
	 * Liquibase liquibase = null; Connection c = null;
	 */
	/*
	 * try { c =
	 * DriverManager.getConnection(DataSources.PROPERTIES.getProperty("jdbc.url"),
	 * DataSources.PROPERTIES.getProperty("jdbc.username"),
	 * DataSources.PROPERTIES.getProperty("jdbc.password"));
	 * 
	 * Database database =
	 * DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new
	 * JdbcConnection(c)); log.info(DataSources.CHANGELOG_MASTER); liquibase = new
	 * Liquibase(DataSources.CHANGELOG_MASTER, new ClassLoaderResourceAccessor(),
	 * database); liquibase.update("main"); } catch (SQLException |
	 * LiquibaseException e) { e.printStackTrace(); throw new
	 * NoSuchElementException(e.getMessage()); } finally { if (c != null) { try {
	 * c.rollback(); c.close(); } catch (SQLException e) { //nothing to do } } }
	 */
	// }

}