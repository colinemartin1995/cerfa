package cerfa.dao.interfaces;

import java.util.List;

public interface IDAO<T> {
	public abstract T create(T obj);
	public abstract T update(T obj);
	public abstract Boolean delete(T obj);
	public abstract List<T> findAll();
	public abstract T find(long id);
	
}
