/**
 * 
 */
package it.unibo.oop.lab.enum2;

public enum Sport {

	BASKET(Place.INDOOR, 5, "Bsketball"), 
	VOLLEY(Place.INDOOR, 6, "Volleyball"),
	TENNIS(Place.OUTDOOR, 2, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Road Biking"),
	F1(Place.OUTDOOR, 1, "Formula 1"),
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"),
	SOCCER(Place.OUTDOOR, 11, "Soccer");
	
    private final int noTeamMembers;
    private final String actualName;
    private final Place place;
    
    Sport(final Place place, final int noTeamMembers, final String actualName) {
    	this.noTeamMembers = noTeamMembers;
    	this.actualName = actualName;
    	this.place = place;
    }
    
    /**
     * @return true only if called on individual sports
     */
    public boolean isIndividualSport() {
    	return this.noTeamMembers == 1;
    }
    
    /**
     * @return true in case the sport is practices indoor
     */
    public boolean isIndoorSport() {
    	return this.place.equals(Place.INDOOR);
    }
    
    /**
     * @return the place where this sport is practiced
     */
    public Place getPlace() {
    	return this.place;
    }
    
    /**
     * @return the String representation of the Sport
     */
    public String toString() {
    	return "Sport[ name=" + this.actualName + ", place=" + this.place
                + ", peoplePerTeam=" + this.noTeamMembers + "]";
    }
}
