package main.java.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//A class 'Film' that implements Comparable
class Film implements Comparable<Film>
{
  private double rating;
  private String name;
  private int year;

  // Used to sort Films by year
  public int compareTo(Film m)
  {
      return this.year - m.year;
  }

  // Constructor
  public Film(String nm, double rt, int yr)
  {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name; }
  public int getYear()      {  return year;  }
  
  public static void main(String[] args)
  {
      ArrayList<Film> list = new ArrayList<Film>();
      list.add(new Film("Force Awakens", 8.3, 2015));
      list.add(new Film("Star Wars", 8.7, 1977));
      list.add(new Film("Empire Strikes Back", 8.8, 1980));
      list.add(new Film("Return of the Jedi", 8.4, 1983));

      // Sort by rating : (1) Create an object of ratingCompare
      //                  (2) Call Collections.sort
      //                  (3) Print Sorted list
      System.out.println("Sorted by rating");
      RatingCompare ratingCompare = new RatingCompare();
      Collections.sort(list, ratingCompare);
      for (Film film: list)
          System.out.println(film.getRating() + " " +
        		  film.getName() + " " +
        		  film.getYear());


      // Call overloaded sort method with RatingCompare
      // (Same three steps as above)
      System.out.println("\nSorted by name");
      NameCompare nameCompare = new NameCompare();
      Collections.sort(list, nameCompare);
      for (Film film: list)
          System.out.println(film.getName() + " " +
        		  film.getRating() + " " +
        		  film.getYear());

      // Uses Comparable to sort by year
      System.out.println("\nSorted by year");
      Collections.sort(list);
      for (Film film: list)
          System.out.println(film.getYear() + " " +
        		  film.getRating() + " " +
        		  film.getName()+" ");
  }
}

//Class to compare Films by ratings
class RatingCompare implements Comparator<Film>
{
  public int compare(Film m1, Film m2)
  {
      if (m1.getRating() < m2.getRating()) return -1;
      if (m1.getRating() > m2.getRating()) return 1;
      else return 0;
  }
}

//Class to compare Films by name
class NameCompare implements Comparator<Film>
{
  public int compare(Film m1, Film m2)
  {
      return m1.getName().compareTo(m2.getName());
  }
}
