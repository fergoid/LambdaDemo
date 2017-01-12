import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.mark.demo.LambdaDemo;
import com.mark.util.MyRequest;
import com.mark.util.MyResponse;
import lombok.extern.java.Log;
import org.junit.Test;

/**
 * Created by a261004 on 12/01/2017.
 */

@Log
public class TestLambdaDemo {

    @Test
    public void testLambda() {
        LambdaDemo demo = new LambdaDemo();
        MyRequest req = new MyRequest();
        req.setMessage("maisie");
        MyResponse resp = demo.handleRequest(req, new Context() {
            @Override
            public String getAwsRequestId() {
                return null;
            }

            @Override
            public String getLogGroupName() {
                return null;
            }

            @Override
            public String getLogStreamName() {
                return null;
            }

            @Override
            public String getFunctionName() {
                return null;
            }

            @Override
            public String getFunctionVersion() {
                return null;
            }

            @Override
            public String getInvokedFunctionArn() {
                return null;
            }

            @Override
            public CognitoIdentity getIdentity() {
                return null;
            }

            @Override
            public ClientContext getClientContext() {
                return null;
            }

            @Override
            public int getRemainingTimeInMillis() {
                return 0;
            }

            @Override
            public int getMemoryLimitInMB() {
                return 0;
            }

            @Override
            public LambdaLogger getLogger() {
                return null;
            }
        });

        assert (resp != null);
        assert(resp.getResponseData().contains("maisie"));
        log.info(resp.getResponseData());

    }

    @Test
    public void testBusinessLogic() {
        LambdaDemo demo = new LambdaDemo();
        MyRequest req = new MyRequest();
        req.setMessage("milly");
        MyResponse resp = demo.executeBusinessLogic(req);
        assert (resp != null);
        assert(resp.getResponseData().contains("milly"));
        log.info(resp.getResponseData());


    }
}
