package com.mark.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.mark.util.MyRequest;
import com.mark.util.MyResponse;
import lombok.extern.java.Log;

/**
 * Created by a261004 on 12/01/2017.
 */

@Log
public class LambdaDemo {

    // Lambda entry point
    public MyResponse handleRequest(MyRequest request, Context context) {
        log.info(">> handleRequest >>" + request.toString());
        MyResponse resp = null;
        resp = executeBusinessLogic(request);
        return resp;
    }

    public MyResponse executeBusinessLogic(MyRequest request) {
        log.info(">> executeBusinessLogic >>" + request.toString());
        MyResponse response = new MyResponse();
        response.setResponseData(String.format("I am responding to your message %1s", request.getMessage()));
        return response;
    }



}
