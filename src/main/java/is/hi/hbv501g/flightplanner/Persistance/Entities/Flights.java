package is.hi.hbv501g.flightplanner.Persistance.Entities;
import jakarta.persistence.*;

/******************************************************************************
 *  Name    : Group 1F
 *  E-mail  : sns25@hi.is, bæta við emailum
 *
 *  Description  : A class that generates the Flight entity.
 *****************************************************************************/

@Entity
@Table(name= "flights")
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String FlightNumber;
    private int duration;
    private String description;
    private boolean madeByAdmin;

    public Flights() {
    }



}