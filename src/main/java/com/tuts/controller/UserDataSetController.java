package com.tuts.controller;

import com.tuts.models.UserEntity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class UserDataSetController {

  @GetMapping("/users")
  public List<UserEntity> entities() {
    try {
      ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
      DataSet<UserEntity> userEntityDataSet = env.fromCollection(
        Arrays.asList(new UserEntity("Kingsley", "Victor", LocalDate.of(1998, 10, 30), "SINGLE"))
      );
      return userEntityDataSet.collect();
    } catch (Exception exc) {
      exc.printStackTrace();
      return null;
    }
  }
}
