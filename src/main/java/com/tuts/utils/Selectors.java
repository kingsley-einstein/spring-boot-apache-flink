package com.tuts.utils;

import com.tuts.models.AddressEntity;
import com.tuts.models.UserEntity;
import java.util.UUID;
import org.apache.flink.api.java.functions.KeySelector;

public class Selectors {

  public static class IdKeySelectorUserEntity implements KeySelector<UserEntity, UUID> {

    @Override
    public UUID getKey(UserEntity value) {
      return value.getId();
    }
  }

  public static class IdKeySelectorAddressEntity implements KeySelector<AddressEntity, UUID> {

    @Override
    public UUID getKey(AddressEntity value) {
      return value.getUserId();
    }
  }
}
