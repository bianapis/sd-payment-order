/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class PaymentOrderApiController {

	@Autowired
	PaymentOrderApiService service;
	
	@Process.ExecutePost
	public BianResponse<MasterOrderRecordBaseWithRoot> executePost(@RequestBody BianRequest<MasterOrderRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<MasterOrderRecordBaseWithRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<MasterOrderRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<PaymentOrderRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentOrderRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("compliances")
	@Process.Retrieve
	public BianResponse<PaymentOrderComplianceBaseWithRootAndId> retrieveCompliances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliances(crReferenceId, bqReferenceId));
	}
	
	@BQ("orders")
	@Process.Retrieve
	public BianResponse<PaymentOrderOrderBaseWithRoot> retrieveOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrders(crReferenceId, bqReferenceId));
	}
	
	@BQ("executions")
	@Process.Retrieve
	public BianResponse<PaymentExecutionBaseWithId> retrieveExecutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExecutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<PaymentOrderRetrieveCapture> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<PaymentOrderReportingBaseWithRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Process.Retrieve
	public BianResponse<PaymentOrderUpdateBaseWithRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<PaymentOrderUpdateBaseWithRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentOrderUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
