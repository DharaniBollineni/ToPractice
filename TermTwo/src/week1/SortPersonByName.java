package week1;
import java.util.Comparator;

public class SortPersonByName implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareToIgnoreCase(p2.getName());
	}

}
