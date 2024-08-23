/** 
 * 		(c) Crown Copyright 2024 Animal and Plant Health Agency
 * 
 * You may use and re-use this software and associated documentation files free of 
 * charge in any format or medium, under the terms of the Open Government Licence v3.0.
 * You may obtain a copy of the Open Government Licence at
 * 
 * 		https://www.nationalarchives.gov.uk/doc/open-government-licence/
 */
package gov.apha.multimodule.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class ServiceProperties {

  /**
   * Test message
   */
  private String message;

  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
}