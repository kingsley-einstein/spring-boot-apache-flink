package com.tuts.controller.mappings;

import com.tuts.models.AddressEntity;
import com.tuts.models.UserEntity;

public class UserAddressMappingClass implements java.io.Serializable {

  public UserEntity user;
  public AddressEntity address;

  public UserAddressMappingClass() {}

  public UserAddressMappingClass(final UserEntity user, final AddressEntity address) {
    this.user = user;
    this.address = address;
  }
}
