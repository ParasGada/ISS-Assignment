import java.util.*;

class Movies implements Comparable<Movies> {
	private double rating;
	private String name;
	private int year;

	public int compareTo(Movies m)
	{
		return this.year - m.year;
	}

	public Movies(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear() { return year; }
}

class RatingCompare implements Comparator<Movies> {
	public int compare(Movies m1, Movies m2)
	{
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

class NameCompare implements Comparator<Movies> {
	public int compare(Movies m1, Movies m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

class ComparatorDemo {
	public static void main(String[] args)
	{
		ArrayList<Movies> list = new ArrayList<Movies>();
		list.add(new Movies("Force Awakens", 8.3, 2015));
		list.add(new Movies("Star Wars", 8.7, 1977));
		list.add(new Movies("Empire Strikes Back", 8.8, 1980));
		list.add(new Movies("Return of the Jedi", 8.4, 1983));

		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (Movies movie : list)
			System.out.println(movie.getRating() + " "
					+ movie.getName() + " "
					+ movie.getYear());

		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movies movie : list)
			System.out.println(movie.getName() + " "
					+ movie.getRating() + " "
					+ movie.getYear());

		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movies movie : list)
			System.out.println(movie.getYear() + " "
					+ movie.getRating() + " "
					+ movie.getName() + " ");
	}
}
