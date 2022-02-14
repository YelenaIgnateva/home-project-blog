/*
 * Home Project Blog Service
 * Blog for the Home Project engineers 
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A representation of Author entity.
 */
@ApiModel(description = "A representation of Author entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-06T18:38:15.498652+02:00[Europe/Kiev]")
public class Author {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;


  public Author name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Author nickname.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Author nickname.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Author firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the Author.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the Author.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Author lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the Author.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the Author.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.name, author.name) &&
        Objects.equals(this.firstName, author.firstName) &&
        Objects.equals(this.lastName, author.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
