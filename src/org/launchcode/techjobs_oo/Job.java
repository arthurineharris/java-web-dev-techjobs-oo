package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        setName(name);
        this.name = getName();
        setEmployer(employer);
        this.employer = getEmployer();
        setLocation(location);
        this.location = getLocation();
        setPositionType(positionType);
        this.positionType = getPositionType();
        setCoreCompetency(coreCompetency);
        this.coreCompetency = getCoreCompetency();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        if (name == null) {
            return "Data Not Available";
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if (this.employer == null) {
            return new Employer("Data Not Available");
        } else {
            return employer;
        }

    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if (this.location == null) {
            return new Location("Data Not Available");
        } else {
            return location;
        }
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (this.positionType == null) {
            return new PositionType("Data Not Available");
        } else {
            return positionType;
        }
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (this.coreCompetency == null) {
            return new CoreCompetency( "Data Not Available");
        } else {
            return coreCompetency;
        }
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String completeJobInfo = "";

        if (this.getName().equals("") || this.getName() == null) {
            this.setName("Data Not Available");
        }
        if (this.getEmployer().equals("") || this.getEmployer() == null) {
            this.setEmployer(new Employer("Data Not Available"));
        }
        if (this.getLocation().equals("") || this.getLocation() == null) {
            this.setLocation(new Location("Data Not Available"));
        }
        if (this.getPositionType().equals("") || this.getPositionType() == null) {
            this.setPositionType(new PositionType("Data Not Available"));
        }
        if (this.getCoreCompetency().equals("") || this.getCoreCompetency() == null) {
            this.setCoreCompetency(new CoreCompetency("Data Not Available"));
        }
       completeJobInfo =
                "\nID:" + this.getId() +
                        "\nName:" + this.getName() +
                        "\nEmployer:" + this.getEmployer() +
                        "\nLocation:" + this.getLocation() +
                        "\nPosition Type:" + this.getPositionType() +
                        "\nCore Competency:" + this.getCoreCompetency() +
                        "\n";
        return completeJobInfo;
    }


}
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//  match.

// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//  and id.

