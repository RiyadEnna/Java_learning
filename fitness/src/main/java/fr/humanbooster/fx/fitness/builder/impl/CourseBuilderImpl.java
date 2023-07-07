package fr.humanbooster.fx.fitness.builder.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import fr.humanbooster.fx.fitness.builder.CourseBuilder;
import fr.humanbooster.fx.fitness.business.Adherent;
import fr.humanbooster.fx.fitness.business.Course;
import fr.humanbooster.fx.fitness.business.Entraineur;
import fr.humanbooster.fx.fitness.business.Tapis;

public class CourseBuilderImpl implements CourseBuilder {
		private Course course;
	    private LocalDate dateDebut;
	    private LocalTime heureDebut;

	public CourseBuilderImpl() {
		course = new Course();
	}


	@Override
	public CourseBuilder definirTapis(Tapis tapis) {
		course.setTapis(tapis);
		return this;
	}

	@Override
	public CourseBuilder definirAdherent(Adherent adherent) {
		course.setAdherent(adherent);
		return this;
	}

	@Override
	public CourseBuilder definirEntraineur(Entraineur entraineur) {
		course.setEntraineur(entraineur);
		return this;
	}

	@Override
	public CourseBuilder definirDistanceEnMetres(int distanceEnMetres) {
		course.setDistanceEnMetres(distanceEnMetres);
		return this;
	}

	@Override
	public CourseBuilder definirDureeEnMinutes(int dureeEnMinutes) {
		course.setDureeEnMinutes(dureeEnMinutes);
		return this;
	}
	@Override
    public CourseBuilder definirDateDebutCourse(LocalDate date) {
        this.dateDebut = date;
        return this;
    }

	@Override
    public CourseBuilder definirHeureDebutCourse(LocalTime heure) {
        this.heureDebut = heure;
        return this;
    }



    public Course build() {
        LocalDateTime tempsEtHeure = LocalDateTime.of(dateDebut, heureDebut);
        course.setDateHeureDebut(tempsEtHeure);
        return course;
    }



}
