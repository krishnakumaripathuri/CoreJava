package Collect;

import java.util.Comparator;

public class BasedOnPrice implements Comparator<Pedilite> {

	@Override
	public int compare(Pedilite o1, Pedilite o2) {

		return (int) (o1.price - o2.price);
	}

}
