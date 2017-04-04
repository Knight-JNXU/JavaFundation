package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity  //实体的注解
@Table(name = "T_PERSON",  //表名
		catalog = "jpa",  //数据库
		schema = "",
		uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })  //唯一约束
public class Person {
	@Id //指定主键
	@SequenceGenerator(name = "id_seq", 
						sequenceName = "person_id_seq", 
						allocationSize = 2, //增量
						initialValue = 3,
						schema = "",
						catalog = "jpa")
	@GeneratedValue(strategy = GenerationType.IDENTITY,
					generator="id_seq")
	//strategy主键生成策略，有
	//TABLE：使用一个特定的数据库表格来保存主键。 （适用于跨不同数据库平台，了解即可）
	//SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。 （适用于oracle数据库）
	//IDENTITY：主键由数据库自动生成（主要是自动增长型） （适用于mysql等数据库）
	//AUTO：主键由程序控制。
	//generator要结合@SequenceGenerator 或 @TableGenerator使用
	private int id;
	@Column(columnDefinition = "name not null", //建表时插入的sql片段
			insertable = true,  //hibernate insert 语句是否包含此字段，默认为true
			length = 255,
			name = "name",
			nullable = false,
			table = "T_PERSON",
			unique = false,
			updatable = true  //hibernate update 语句是否包含此字段，默认为true
			)
	private String name;
	
	@Column(precision = 1,
			scale = 20)  //小数位数
	private Double salary;
	
	
	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
