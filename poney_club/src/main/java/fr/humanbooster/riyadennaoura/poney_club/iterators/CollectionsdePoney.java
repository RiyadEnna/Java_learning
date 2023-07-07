package fr.humanbooster.riyadennaoura.poney_club.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.humanbooster.riyadennaoura.poney_club.business.Poney;


public class CollectionsdePoney implements Iterator<Poney> {
	private static List<Poney> poneys ;
	private int position = 0;
	
	public List<Poney> createPoneys() {
	    poneys = new ArrayList<>();

	    Poney ribambelle = new Poney("Ribambelle");
	    Poney ping = new Poney("Ping");
	    Poney pong = new Poney("Pong");
	    Poney impala = new Poney("Impala");
	    Poney bueno = new Poney("Bueno");
	    Poney country = new Poney("Country");
	    Poney forza = new Poney("Forza");
	    Poney horizon = new Poney("Horizon");
	    Poney cassandra = new Poney("Cassandra");
	    Poney oasis = new Poney("Oasis");

	    poneys.add(ribambelle);
	    poneys.add(ping);
	    poneys.add(pong);
	    poneys.add(impala);
	    poneys.add(bueno);
	    poneys.add(country);
	    poneys.add(forza);
	    poneys.add(horizon);
	    poneys.add(cassandra);
	    poneys.add(oasis);

	    return poneys;
	}
	
	
	@Override
	public boolean hasNext() {
		return position < poneys.size();
	}
	@Override
	public Poney next() {
		if (poneys.isEmpty()) {
			return null;
		}
		
		return poneys.get(position++);
	}
	
	
	public Iterator<Poney> iterator() {
		return poneys.iterator();
	}

	public List<Poney> getPoney() {
		return poneys;
	}


}