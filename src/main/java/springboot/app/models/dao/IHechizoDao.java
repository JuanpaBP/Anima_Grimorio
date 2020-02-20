package springboot.app.models.dao;

import java.util.List;

import springboot.app.models.entity.Hechizo;

public interface IHechizoDao {
	
	public List<Hechizo> findAll();
}
