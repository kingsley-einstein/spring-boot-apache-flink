package com.tuts.models;

import java.util.UUID;

public class AddressEntity implements java.io.Serializable {

  private UUID userId;
  private Integer houseNumber;
  private String streetName;
  private String cityName;
  private String stateName;
  private String countryName;

  public AddressEntity() {}

  public AddressEntity(
    final UUID userId,
    final Integer houseNumber,
    final String streetName,
    final String cityName,
    final String stateName,
    final String countryName
  ) {
    this.userId = userId;
    this.houseNumber = houseNumber;
    this.streetName = streetName;
    this.cityName = cityName;
    this.stateName = stateName;
    this.countryName = countryName;
  }

  public void setHouseNumber(final Integer houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Integer getHouseNumber() {
    return this.houseNumber;
  }

  public void setStreetName(final String streetName) {
    this.streetName = streetName;
  }

  public String getStreetName() {
    return this.streetName;
  }

  public void setCityName(final String cityName) {
    this.cityName = cityName;
  }

  public String getCityName() {
    return this.cityName;
  }

  public void setStateName(final String stateName) {
    this.stateName = stateName;
  }

  public String getStateName() {
    return this.stateName;
  }

  public void setCountryName(final String countryName) {
    this.countryName = countryName;
  }

  public String getCountryName() {
    return this.countryName;
  }

  public UUID getUserId() {
    return this.userId;
  }
}
