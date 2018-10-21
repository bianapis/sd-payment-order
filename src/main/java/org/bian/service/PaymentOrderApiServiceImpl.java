/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PaymentOrderApiServiceImpl implements PaymentOrderApiService {

	public MasterOrderRecordBaseWithRoot executePost(MasterOrderRecordBase request){
		return JsonReader.read("executePost-MasterOrderRecordBaseWithRoot.json",new TypeReference<MasterOrderRecordBaseWithRoot>(){});
	}
	
	public MasterOrderRecordBaseWithRoot executePut(String crReferenceId, MasterOrderRecordBase request){
		return JsonReader.read("executePut-MasterOrderRecordBaseWithRoot.json",new TypeReference<MasterOrderRecordBaseWithRoot>(){});
	}
	
	public PaymentOrderRecordResponse record(String crReferenceId, PaymentOrderRecordRequest request){
		return JsonReader.read("record-PaymentOrderRecordResponse.json",new TypeReference<PaymentOrderRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentOrderComplianceBaseWithRootAndId retrieveCompliances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentOrderComplianceBaseWithRootAndId.json",new TypeReference<PaymentOrderComplianceBaseWithRootAndId>(){});
	}
	
	public PaymentOrderOrderBaseWithRoot retrieveOrders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentOrderOrderBaseWithRoot.json",new TypeReference<PaymentOrderOrderBaseWithRoot>(){});
	}
	
	public PaymentExecutionBaseWithId retrieveExecutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionBaseWithId.json",new TypeReference<PaymentExecutionBaseWithId>(){});
	}
	
	public PaymentOrderRetrieveCapture retrieve(String crReferenceId){
		return JsonReader.read("retrieve-PaymentOrderRetrieveCapture.json",new TypeReference<PaymentOrderRetrieveCapture>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentOrderReportingBaseWithRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentOrderReportingBaseWithRoot.json",new TypeReference<PaymentOrderReportingBaseWithRoot>(){});
	}
	
	public PaymentOrderUpdateBaseWithRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentOrderUpdateBaseWithRoot.json",new TypeReference<PaymentOrderUpdateBaseWithRoot>(){});
	}
	
	public PaymentOrderUpdateBaseWithRoot update(String crReferenceId, PaymentOrderUpdateBase request){
		return JsonReader.read("update-PaymentOrderUpdateBaseWithRoot.json",new TypeReference<PaymentOrderUpdateBaseWithRoot>(){});
	}
	
}
