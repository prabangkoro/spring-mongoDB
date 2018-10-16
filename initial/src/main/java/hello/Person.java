package hello;

import org.springframework.data.annotation.Id;

public class Person {

  @Id
  private String id;

  private String firstName;
  private String lastName;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String name) {
    this.firstName = name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String name) {
    this.lastName = name;
  }

}
