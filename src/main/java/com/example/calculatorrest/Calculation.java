package com.example.calculatorrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Calculation {

  private Double num0;
  private Double num1;
  private String operator;

  public Calculation(Double num0, Double num1, String operator) {
    this.num0 = num0;
    this.num1 = num1;
    this.operator = operator;
  }

  public Double getResult() {
    if (operator.equals("+")) {
      return num0 + num1;
    } else if (operator.equals("-")) {
      return num0 - num1;
    } else if (operator.equals("/")) {
      try {
        return num0 / num1;
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (operator.equals("*")) {
      return num0 * num1;
    } else if (operator.equals("**")) {
      return Math.pow(num0, num1);
    }
    return 0.0;
  }

  public String getOperator() {
    return operator;
  }

  public Double getNum0() {
    return num0;
  }

  public Double getNum1() {
    return num1;
  }

  @Override
  public String toString() {
    return "Calculation Result {" +
        num0 + ' ' + 
        operator + ' ' + 
        num1 + '=' + 
        this.getResult() + '}';
  }
}