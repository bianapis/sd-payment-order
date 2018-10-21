/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PaymentOrderApiService {

	MasterOrderRecordBaseWithRoot executePost(MasterOrderRecordBase request);
	
	MasterOrderRecordBaseWithRoot executePut(String crReferenceId, MasterOrderRecordBase request);
	
	PaymentOrderRecordResponse record(String crReferenceId, PaymentOrderRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	PaymentOrderComplianceBaseWithRootAndId retrieveCompliances(String crReferenceId, String bqReferenceId);
	
	PaymentOrderOrderBaseWithRoot retrieveOrders(String crReferenceId, String bqReferenceId);
	
	PaymentExecutionBaseWithId retrieveExecutions(String crReferenceId, String bqReferenceId);
	
	PaymentOrderRetrieveCapture retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	PaymentOrderReportingBaseWithRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	PaymentOrderUpdateBaseWithRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	PaymentOrderUpdateBaseWithRoot update(String crReferenceId, PaymentOrderUpdateBase request);
	
}
