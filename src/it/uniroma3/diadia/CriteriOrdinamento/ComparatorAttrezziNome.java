package it.uniroma3.diadia.CriteriOrdinamento;

import java.util.Comparator;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComparatorAttrezziNome implements Comparator<Attrezzo>{
	@Override
	public int compare(Attrezzo o1, Attrezzo o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}
