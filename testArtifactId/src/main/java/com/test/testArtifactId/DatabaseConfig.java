package com.test.testArtifactId;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "DATABASE_CONFIG")
public class DatabaseConfig implements java.io.Serializable {

	private static final long serialVersionUID = -4476082842953667943L;

	@Id
	@Column(name = "ID_DATABASE_CONFIG")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDatabaseConfig;

}
