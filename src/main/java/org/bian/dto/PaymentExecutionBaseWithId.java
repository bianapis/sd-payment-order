package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentExecutionBaseWithId
 */
public class PaymentExecutionBaseWithId   {
  private String paymentExecutionServiceReference = null;

  private String paymentExecutionServiceStatus = null;

  private String paymentOrderRequestReference = null;

  private String paymentOrderReference = null;

  private String paymentExecutionTransactionReference = null;

  private String paymentOrder = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return paymentExecutionServiceReference
  **/

  public String getPaymentExecutionServiceReference() {
    return paymentExecutionServiceReference;
  }

  public void setPaymentExecutionServiceReference(String paymentExecutionServiceReference) {
    this.paymentExecutionServiceReference = paymentExecutionServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentExecutionServiceStatus
  **/

  public String getPaymentExecutionServiceStatus() {
    return paymentExecutionServiceStatus;
  }

  public void setPaymentExecutionServiceStatus(String paymentExecutionServiceStatus) {
    this.paymentExecutionServiceStatus = paymentExecutionServiceStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return paymentOrderRequestReference
  **/

  public String getPaymentOrderRequestReference() {
    return paymentOrderRequestReference;
  }

  public void setPaymentOrderRequestReference(String paymentOrderRequestReference) {
    this.paymentOrderRequestReference = paymentOrderRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return paymentExecutionTransactionReference
  **/

  public String getPaymentExecutionTransactionReference() {
    return paymentExecutionTransactionReference;
  }

  public void setPaymentExecutionTransactionReference(String paymentExecutionTransactionReference) {
    this.paymentExecutionTransactionReference = paymentExecutionTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return paymentOrder
  **/

  public String getPaymentOrder() {
    return paymentOrder;
  }

  public void setPaymentOrder(String paymentOrder) {
    this.paymentOrder = paymentOrder;
  }


}

