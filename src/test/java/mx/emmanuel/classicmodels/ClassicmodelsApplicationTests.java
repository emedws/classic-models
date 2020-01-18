package mx.emmanuel.classicmodels;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

@SpringBootTest
class ClassicmodelsApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
		List<Map<String, Object>> tables = jdbcTemplate.queryForList("SHOW TABLES");
		assertThat(tables.size(), is(2));
	}

}
