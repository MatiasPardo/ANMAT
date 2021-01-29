package org.anmat.conection;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;


/**
 * @author FBocchio
 *
 */
public class ClientPasswordCallback implements CallbackHandler {
	
	public ClientPasswordCallback() {
	}

	public void handle(Callback[] callbacks) throws IOException, 
            UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        pc.setPassword("testwservicepsw");

    }
}
