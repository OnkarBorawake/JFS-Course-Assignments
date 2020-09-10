package com.manipal.model;

import javax.persistence.*;

@Entity
@Table(name="conversions1")
public class ConversionRate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="from_unit")
	private String from;
	
	@Column(name="to_unit")
	private String to;
	
	@Column(name="conversion_multiple")
	private double conversionMultiple;
	public ConversionRate() {
		
		// TODO Auto-generated constructor stub
	}
	public ConversionRate(long id, String from, String to, double conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	@Override
	public String toString() {
		return "ConversionRate [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + "]";
	}
	
	
	
}

