package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentOrderComplianceBaseWithRootAndId
 */
public class PaymentOrderComplianceBaseWithRootAndId   {
  private String paymentOrderRequestReference = null;

  private String paymentOderComplianceCheckReference = null;

  private String payerReference = null;

  private String payeeReference = null;

  private String amount = null;

  private String currency = null;

  private String paymentOrderComplianceCheckType = null;

  private String paymentOrderComplianceCheckResult = null;


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
   * @return paymentOderComplianceCheckReference
  **/

  public String getPaymentOderComplianceCheckReference() {
    return paymentOderComplianceCheckReference;
  }

  public void setPaymentOderComplianceCheckReference(String paymentOderComplianceCheckReference) {
    this.paymentOderComplianceCheckReference = paymentOderComplianceCheckReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return payerReference
  **/

  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentOrderComplianceCheckType
  **/

  public String getPaymentOrderComplianceCheckType() {
    return paymentOrderComplianceCheckType;
  }

  public void setPaymentOrderComplianceCheckType(String paymentOrderComplianceCheckType) {
    this.paymentOrderComplianceCheckType = paymentOrderComplianceCheckType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentOrderComplianceCheckResult
  **/

  public String getPaymentOrderComplianceCheckResult() {
    return paymentOrderComplianceCheckResult;
  }

  public void setPaymentOrderComplianceCheckResult(String paymentOrderComplianceCheckResult) {
    this.paymentOrderComplianceCheckResult = paymentOrderComplianceCheckResult;
  }


}

