package ru.mera.ivstepan.carshowroom.soap.service.interseptors;

import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.cxf.message.Message;

@OutInterceptors
public class AppOutboundInterceptor extends LoggingOutInterceptor {

	@Override
	public void handleMessage(Message message) throws Fault {
		processPayLoad(message);
		super.handleMessage(message);
	}

	private void processPayLoad(Message message) {
		System.out.println("*** PROCESSING PAYLOAD AT OUT-INTERCEPTOR **");
	}
}
