import java.time.*;

import java.time.format.DateTimeFormatter;



import static java.time.temporal.ChronoUnit.MINUTES;

import java.text.DecimalFormat;

import static java.time.temporal.ChronoUnit.HOURS;



import java.util.*;

public class Headache {

private LocalDate date; 
private LocalTime startTime; 
private LocalTime endTime; 
private Severity severity;
private Location location; 
private HeadacheType headacheType; 
private Medication medication; 
private Phase phase; 
public float tseverity = 0;
private static DecimalFormat df = new DecimalFormat(".##"); 


public Headache(LocalDate date, LocalTime startTime, LocalTime endTime, Severity severity,
		Location location, HeadacheType headacheType,Medication medication, Phase phase) {
	this.date = date; 
	this.startTime = startTime; 
	this.endTime = endTime; 
	this.severity = severity; 
	this.setLocation(location); 
	this.headacheType = headacheType; 
	this.medication = medication; 
	this.phase = phase; 
}

public Phase getPhase(){
	return this.phase; 
}

public double getHeadacheDuration(){
	double elapsedTime = ((double)getStartTime().until(getEndTime(),MINUTES))/60;	
	return Double.valueOf(df.format(elapsedTime)); 
}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;

}

public Severity getSeverity() {
	return severity;
}

public void setSeverity(Severity severity) {
	this.severity = severity;
}

public LocalTime getStartTime() {
	return startTime;
}


public LocalTime getEndTime() {
	return endTime;
}

public void setEndTime(LocalTime endTime) {
	this.endTime = endTime;
}

/**
 * @return the med
 */
public Medication getMed() {
	return medication;
}

/**
 * @param med the med to set
 */
public void setMed(Medication med) {
	this.medication = med;
}

/**
 * @return the headacheType
 */
public HeadacheType getHeadacheType() {
	return headacheType;
}

/**
 * @return the location
 */
public Location getLocation() {
	return location;
}

/**
 * @param location the location to set
 */
public void setLocation(Location location) {
	this.location = location;
}

}