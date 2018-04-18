package jpa;

import domaine.Courant;

public class CourantDao extends JpaDao<Courant> {

	public void create(Courant courant) {

	}

	@Override
	public Courant read(Integer id) {
		return this.read(Courant.class, id);
	}

	public void update(Courant courant) {

	}

	public void delete(Integer id) {
	}

}
