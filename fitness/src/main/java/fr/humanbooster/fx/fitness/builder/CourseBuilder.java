package fr.humanbooster.fx.fitness.builder;

import java.time.LocalDate;
import java.time.LocalTime;

import fr.humanbooster.fx.fitness.business.Adherent;
import fr.humanbooster.fx.fitness.business.Course;
import fr.humanbooster.fx.fitness.business.Entraineur;
import fr.humanbooster.fx.fitness.business.Tapis;

/**
 * Chaque méthode doit renvoyer un objet de type CourseBuilder
 * à l'exception de la méthode build()
 * 
 * @author efiku
 *
 */
public interface CourseBuilder {

    CourseBuilder definirTapis(Tapis tapis);
    
    CourseBuilder definirAdherent(Adherent adherent);

    CourseBuilder definirEntraineur(Entraineur entraineur);
    
    CourseBuilder definirDistanceEnMetres(int distanceEnMetres);
    
    CourseBuilder definirDureeEnMinutes(int dureeEnMinutes);
    
    CourseBuilder definirDateDebutCourse(LocalDate dateSaisie);
    
    CourseBuilder definirHeureDebutCourse(LocalTime heureSaisie);
    
    Course build();

}