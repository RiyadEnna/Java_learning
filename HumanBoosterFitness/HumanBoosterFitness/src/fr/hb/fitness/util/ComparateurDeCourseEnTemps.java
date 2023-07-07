package fr.hb.fitness.util;

import java.util.Comparator;

import fr.hb.fitness.Riyad.business.Course;

public class ComparateurDeCourseEnTemps implements Comparator<Course> {

	@Override
	public int compare(Course course1, Course course2) {
		return Integer.valueOf(course1.getDureeEnMinute()).compareTo(course2.getDureeEnMinute());
	}

}
