package com.example.Hotel.domain;




import javax.persistence.*;

@Entity
@Table(name = "room")
public class RoomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="start_date")
    private String sdate;

    @Column(name="end_date")
    private String edate;

    @Column(name="no_of_rooms")
    private String nrooms;

    @Column
    private String name;
    
    @Column
    private String address;
    
    public RoomReservation() {

	}
    
	public RoomReservation(Long id, String sdate, String edate, String nrooms,String name , String address) {
		
		this.id = id;
		this.sdate = sdate;
		this.edate = edate;
		this.nrooms = nrooms;
		this.name = name;
		this.address= address;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSdate() {
		return sdate;
	}


	public void setSdate(String sdate) {
		this.sdate = sdate;
	}


	public String getEdate() {
		return edate;
	}


	public void setEdate(String edate) {
		this.edate = edate;
	}


	public String getNrooms() {
		return nrooms;
	}


	public void setNrooms(String nrooms) {
		this.nrooms = nrooms;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
    




    


}
