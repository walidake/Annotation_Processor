package com.walidake.annotation.model;


public class AnimalFactory {

  public Animal create(String id) {
    if (id == null) {
      throw new IllegalArgumentException("id is null!");
    }
    if ("bird".equals(id)) {
      return new com.walidake.annotation.model.Bird();
    }

    if ("dog".equals(id)) {
      return new com.walidake.annotation.model.Dog();
    }

    if ("fish".equals(id)) {
      return new com.walidake.annotation.model.Fish();
    }

    throw new IllegalArgumentException("Unknown id = " + id);
  }
}
