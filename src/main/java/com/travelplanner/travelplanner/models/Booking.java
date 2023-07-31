package com.travelplanner.travelplanner.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;

    private LocalDate bookingDate;
    private int passengerCount;

    public Booking() {
    }

    public Booking(User user, Destination destination, LocalDate bookingDate, int passengerCount) {
        this.user = user;
        this.destination = destination;
        this.bookingDate = bookingDate;
        this.passengerCount = passengerCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", user=" + user +
                ", destination=" + destination +
                ", bookingDate=" + bookingDate +
                ", passengerCount=" + passengerCount +
                '}';
    }
}
